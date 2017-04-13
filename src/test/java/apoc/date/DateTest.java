package apoc.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.stream.Stream;
import apoc.util.TestUtil;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.QueryExecutionException;
import org.neo4j.graphdb.Transaction;
import org.neo4j.helpers.collection.Iterators;
import org.neo4j.test.TestGraphDatabaseFactory;

import static apoc.util.MapUtil.map;
import static apoc.util.TestUtil.testCall;
import static java.util.stream.Collectors.toList;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.*;


public class DateTest {
	@Rule public ExpectedException expected = ExpectedException.none();
	private static GraphDatabaseService db;
	private DateFormat defaultFormat = formatInUtcZone("yyyy-MM-dd HH:mm:ss");
	private String epochAsString = defaultFormat.format(new java.util.Date(0L));
	private java.util.Date testDate = new java.util.Date(1464739200000L);
	private String testDateAsString = defaultFormat.format( testDate );
	private static final long SECONDS_PER_MINUTE = 60;
	private static final long SECONDS_PER_HOUR = SECONDS_PER_MINUTE * 60;
	private static final long SECONDS_PER_DAY = SECONDS_PER_HOUR * 24;

	@BeforeClass
	public static void sUp() throws Exception {
		db = new TestGraphDatabaseFactory().newImpermanentDatabase();
		TestUtil.registerProcedure(db, Date.class);
	}

	@AfterClass
	public static void tearDown() {
		db.shutdown();
	}

	@Test public void testToDays() throws Exception {
		testCall(db,
				"RETURN apoc.date.parse({date},'d') AS value",
				map("date",testDateAsString),
				row -> assertEquals(testDate.toInstant(), Instant.ofEpochSecond (SECONDS_PER_DAY * (long) row.get("value"))));
	}

	@Test public void testToHours() throws Exception {
		testCall(db,
				"RETURN apoc.date.parse({date},'h') AS value",
				map("date",testDateAsString),
				row -> assertEquals(testDate.toInstant(), Instant.ofEpochSecond (SECONDS_PER_HOUR * (long) row.get("value"))));
	}

	@Test public void testToMinutes() throws Exception {
		testCall(db,
				"RETURN apoc.date.parse({date},'m') AS value",
				map("date",testDateAsString),
				row -> assertEquals(testDate.toInstant(), Instant.ofEpochSecond (SECONDS_PER_MINUTE * (long) row.get("value"))));
	}

	@Test public void testToUnixtime() throws Exception {
		testCall(db,
				"RETURN apoc.date.parse({date},'s') AS value",
				map("date",epochAsString),
				row -> assertEquals(Instant.EPOCH, Instant.ofEpochSecond((long) row.get("value"))));
	}

	@Test public void testToMillis() throws Exception {
		testCall(db,
				"RETURN apoc.date.parse({date},'ms') AS value",
				map("date",epochAsString),
				row -> assertEquals(Instant.EPOCH, Instant.ofEpochMilli((long) row.get("value"))));
	}

	@Test public void testToUnixtimeWithCorrectFormat() throws Exception {
		String pattern = "MM/dd/yyyy HH:mm:ss";
		SimpleDateFormat customFormat = formatInUtcZone(pattern);
		String reference = customFormat.format(new java.util.Date(0L));
		testCall(db,
				"RETURN apoc.date.parse({date},'s',{pattern}) AS value",
				map("date",reference,"pattern",pattern),
				row -> assertEquals(Instant.EPOCH, Instant.ofEpochSecond((long) row.get("value"))));
	}

	@Test public void testToUnixtimeWithIncorrectPatternFormat() throws Exception {
		expected.expect(instanceOf(QueryExecutionException.class));
		testCall(db,
				"RETURN apoc.date.parse('12/12/1945 12:12:12','s','MM/dd/yyyy HH:mm:ss/neo4j') AS value",
				row -> assertEquals(Instant.EPOCH, Instant.ofEpochSecond((long) row.get("value"))));
	}

	@Test public void testToUnixtimeWithNullInput() throws Exception {
		testCall(db,
				"RETURN apoc.date.parse(NULL,'s') AS value",
				row -> assertNull(row.get("value")));
	}

	@Test public void testFromUnixtime() throws Exception {
		testCall(db,
				"RETURN apoc.date.format(0,'s') AS value",
				row -> {
					try {
						assertEquals(new java.util.Date(0L), defaultFormat.parse((String) row.get("value")));
					} catch (ParseException e) {
						throw new RuntimeException(e);
					}
				});
	}

	@Test public void testFromUnixtimeWithCorrectFormat() throws Exception {
		String pattern = "MM/dd/yyyy HH:mm:ss";
		SimpleDateFormat customFormat = formatInUtcZone(pattern);
		testCall(db,
				"RETURN apoc.date.format(0,'s',{pattern}) AS value",
				map("pattern",pattern),
				row -> {
					try {
						assertEquals(new java.util.Date(0L), customFormat.parse((String) row.get("value")));
					} catch (ParseException e) {
						throw new RuntimeException(e);
					}
				});
	}

	@Test public void testFromUnixtimeWithCorrectFormatAndTimeZone() throws Exception {
		String pattern = "MM/dd/yyyy HH:mm:ss";
		String timezone = "America/New_York";
		SimpleDateFormat customFormat = formatInCustomTimeZone(pattern, timezone);
		testCall(db,
				"RETURN apoc.date.format(0,'s',{pattern},{timezone}) AS value",
				map("pattern",pattern,"timezone",timezone),
				row -> {
					try {
						assertEquals(new java.util.Date(0L), customFormat.parse((String) row.get("value")));
					} catch (ParseException e) {
						throw new RuntimeException(e);
					}
				});
	}

	@Test public void testFromUnixtimeWithIncorrectPatternFormat() throws Exception {
		expected.expect(instanceOf(QueryExecutionException.class));
		testCall(db,
				"RETURN apoc.date.format(0,'s','MM/dd/yyyy HH:mm:ss/neo4j') AS value",
				row -> {});
	}

	@Test public void testFromUnixtimeWithIncorrectPatternFormatAndTimeZone() throws Exception {
		expected.expect(instanceOf(QueryExecutionException.class));
		testCall(db,
				"RETURN apoc.date.formatTimeZone(0,'s','MM/dd/yyyy HH:mm:ss/neo4j','Neo4j/Apoc') AS value",
				row -> {});
	}

	@Test public void testFromUnixtimeWithNegativeInput() throws Exception {
		expected.expect(instanceOf(QueryExecutionException.class));
		testCall(db, "RETURN apoc.date.format(-1,'s') AS value", row -> {});
	}

	@Test public void testOrderByDate() throws Exception {
		SimpleDateFormat format = formatInUtcZone("yyyy-MM-dd HH:mm:ss");
		try (Transaction tx = db.beginTx()) {
			for (int i = 0 ; i < 8; i++) {
				Node datedNode = db.createNode(() -> "Person");
				datedNode.setProperty("born", format.format(java.util.Date.from(Instant.EPOCH.plus(i, ChronoUnit.DAYS))));
			}
			for (int i = 15 ; i >= 8; i--) {
				Node datedNode = db.createNode(() -> "Person");
				datedNode.setProperty("born", format.format(java.util.Date.from(Instant.EPOCH.plus(i, ChronoUnit.DAYS))));
			}
			tx.success();
		}

		List<java.util.Date> expected = Stream.iterate(Instant.EPOCH, prev -> prev.plus(1, ChronoUnit.DAYS))
				.limit(16)
				.map(java.util.Date::from)
				.sorted()
				.collect(toList());

		List<java.util.Date> actual;
		try (Transaction tx = db.beginTx()) {
			String query = "MATCH (p:Person) RETURN p, apoc.date.parse(p.born,'s') as dob ORDER BY dob ";
			actual = Iterators.asList(db.execute(query).<Long>columnAs("dob")).stream()
					.map(dob -> java.util.Date.from(Instant.ofEpochSecond((long) dob)))
					.collect(toList());
			tx.success();
		}

		assertEquals(expected, actual);
	}

	@Test
	public void testfields() throws Exception {
		testCall(db,
				"RETURN apoc.date.fields('2015-01-02 03:04:05') AS value",
				row -> {
					Map<String, Object> map = (Map<String, Object>) row.get("value");
					assertEquals(2015L, map.get("years"));
					assertEquals(1L, map.get("months"));
					assertEquals(2L, map.get("days"));
					assertEquals(5L, map.get("weekdays"));
					assertEquals(3L, map.get("hours"));
					assertEquals(4L, map.get("minutes"));
					assertEquals(5L, map.get("seconds"));
				});
	}

	@Test
	public void testfieldsCustomFormat() throws Exception {
		testCall(db,
				"RETURN apoc.date.fields('2015-01-02 03:04:05 EET', 'yyyy-MM-dd HH:mm:ss zzz') AS m",
				row -> {
					Map<String, Object> split = (Map<String, Object>) row.get("m");
					assertEquals(2015L, split.get("years"));
					assertEquals(1L, split.get("months"));
					assertEquals(2L, split.get("days"));
					assertEquals(3L, split.get("hours"));
					assertEquals(4L, split.get("minutes"));
					assertEquals(5L, split.get("seconds"));
					assertEquals(
							TimeZone.getTimeZone("EET").getRawOffset(),
							TimeZone.getTimeZone((String)split.get("zoneid")).getRawOffset()
					);
				});

		testCall(db,
				"RETURN apoc.date.fields('2015/01/02/03/04/05/EET', 'yyyy/MM/dd/HH/mm/ss/z') AS value",
				row -> {
					Map<String, Object> split = (Map<String, Object>) row.get("value");
					assertEquals(2015L, split.get("years"));
					assertEquals(1L, split.get("months"));
					assertEquals(2L, split.get("days"));
					assertEquals(3L, split.get("hours"));
					assertEquals(4L, split.get("minutes"));
					assertEquals(5L, split.get("seconds"));
					assertEquals(
							TimeZone.getTimeZone("EET").getRawOffset(),
							TimeZone.getTimeZone((String)split.get("zoneid")).getRawOffset()
					);
				});

		testCall(db,
				"RETURN apoc.date.fields('2015/01/02_EET', 'yyyy/MM/dd_z') AS value",
				row -> {
					Map<String, Object> split = (Map<String, Object>) row.get("value");
					assertEquals(2015L, split.get("years"));
					assertEquals(1L, split.get("months"));
					assertEquals(2L, split.get("days"));
					assertEquals(
							TimeZone.getTimeZone("EET").getRawOffset(),
							TimeZone.getTimeZone((String)split.get("zoneid")).getRawOffset()
					);
				});
	}

	@Test
	public void testfieldsNullInput() throws Exception {
		testCall(db,
				"RETURN apoc.date.fields(NULL, 'yyyy-MM-dd HH:mm:ss zzz') AS value",
				row -> {
					Map<String, Object> split = (Map<String, Object>) row.get("value");
					assertTrue(split.isEmpty());
				});
	}

	@Test
	public void testDateParserDifference() throws Exception {
		String dateDelta = "RETURN apoc.date.parse('2012-10-04','ms','yyyy-MM-dd') - apoc.date.parse('2012-10-04 00:00:00') as delta";
		testCall(db, dateDelta, row -> assertTrue(3600*1000*24 > (long)row.get("delta")));
	}

	@Test
	public void toYears() throws Exception {
		testCall(db, "RETURN apoc.date.toYears('2012-10-04','YYYY-MM-dd') as years", row -> assertEquals(2012d, (double)row.get("years"),0.5d));
		testCall(db, "RETURN apoc.date.toYears(apoc.date.parse('2012','ms','YYYY') - apoc.date.parse('2008','ms','YYYY')) as years", row -> assertEquals(4d, (double)row.get("years"),0.5d));
	}

	@Test
	public void testGetTimezone() throws Exception {
		testCall(db, "RETURN apoc.date.systemTimezone() as tz", row -> assertEquals(TimeZone.getDefault().getID(), row.get("tz").toString()));
	}

	@Test
	public void testConvert() throws Exception {
		Long firstOf2017ms = 1483228800000l;
		Long firstOf2017d = 17167l;
		Map<String, Object> params = new HashMap<>();
		params.put("firstOf2017ms", firstOf2017ms);
		testCall(db, "RETURN apoc.date.convert($firstOf2017ms, 'ms', 'd') as firstOf2017days", params, row -> assertEquals(firstOf2017d, row.get("firstOf2017days")));
	}

	@Test
	public void testAdd() throws Exception {
		Long firstOf2017ms = 1483228800000l;
		Long firstOf2017Plus5Daysms = 1483660800000l;
		Map<String, Object> params = new HashMap<>();
		params.put("firstOf2017ms", firstOf2017ms);
		testCall(db, "RETURN apoc.date.add($firstOf2017ms, 'ms', 5, 'd') as firstOf2017Plus5days", params, row -> assertEquals(firstOf2017Plus5Daysms, row.get("firstOf2017Plus5days")));
	}

	@Test
	public void testAddNegative() throws Exception {
		Long firstOf2017ms = 1483228800000l;
		Long firstOf2017Minus5Daysms = 1482796800000l;
		Map<String, Object> params = new HashMap<>();
		params.put("firstOf2017ms", firstOf2017ms);
		testCall(db, "RETURN apoc.date.add($firstOf2017ms, 'ms', -5, 'd') as firstOf2017Minus5days", params, row -> assertEquals(firstOf2017Minus5Daysms, row.get("firstOf2017Minus5days")));
	}

	private SimpleDateFormat formatInUtcZone(final String pattern) {
		SimpleDateFormat customFormat = new SimpleDateFormat(pattern);
		customFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		return customFormat;
	}

	private SimpleDateFormat formatInCustomTimeZone(final String pattern, final String timezone) {
		SimpleDateFormat customFormat = new SimpleDateFormat(pattern);
		customFormat.setTimeZone(TimeZone.getTimeZone(timezone));
		return customFormat;
	}
}
