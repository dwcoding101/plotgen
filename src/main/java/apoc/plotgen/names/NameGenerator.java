package apoc.plotgen.names;

import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.procedure.Description;
import org.neo4j.procedure.Name;
import org.neo4j.procedure.UserFunction;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Daniel on 18/04/2017.
 */
public class NameGenerator {


    @UserFunction(name = "apoc.plotgen.names.humanSurname")
    @Description("apoc.plotgen.names.humanSurmane()")
    public String humanSurname() {
        String ret;
        int randNumber;

        Random random = new Random();
        int min = 1;
        int max = 100;
        randNumber = random.nextInt(max - min + 1) + min;
        switch (randNumber) {
            case 1  :
                ret = "Adelhof";
                break;
            case 2  :
                ret = "Albrecht";
                break;
            case 3  :
                ret = "Allenstag";
                break;
            case 4  :
                ret = "Altmann";
                break;
            case 5  :
                ret = "Atzwig";
                break;
            case 6  :
                ret = "Bacher";
                break;
            case 7  :
                ret = "Baer";
                break;
            case 8  :
                ret = "Baumann";
                break;
            case 9  :
                ret = "Becker";
                break;
            case 10 :
                ret = "Behn";
                break;
            case 11 :
                ret = "Betz";
                break;
            case 12 :
                ret = "Beyer";
                break;
            case 13 :
                ret = "Bischof";
                break;
            case 14 :
                ret = "Boehm";
                break;
            case 15 :
                ret = "Breitenbach";
                break;
            case 16 :
                ret = "Breuer";
                break;
            case 17 :
                ret = "Dahmbach";
                break;
            case 18 :
                ret = "Delfholt";
                break;
            case 19 :
                ret = "Drakenhof";
                break;
            case 20 :
                ret = "Drauwulf";
                break;
            case 21 :
                ret = "Durrbein";
                break;
            case 22 :
                ret = "Ehrhard";
                break;
            case 23 :
                ret = "Eisenhauer";
                break;
            case 24 :
                ret = "Eschlimann";
                break;
            case 25 :
                ret = "Falkznheim";
                break;
            case 26 :
                ret = "Fehr";
                break;
            case 27 :
                ret = "Fiegler";
                break;
            case 28 :
                ret = "Fleischer";
                break;
            case 29 :
                ret = "Frohlich";
                break;
            case 30 :
                ret = "Frueh";
                break;
            case 31 :
                ret = "Fuchs";
                break;
            case 32 :
                ret = "Gaffwig";
                break;
            case 33 :
                ret = "Gaertner";
                break;
            case 34 :
                ret = "Gebauer";
                break;
            case 35 :
                ret = "Godlgraf";
                break;
            case 36 :
                ret = "Grunenwald";
                break;
            case 37 :
                ret = "Guth";
                break;
            case 38 :
                ret = "Haintz";
                break;
            case 39 :
                ret = "Herz";
                break;
            case 40 :
                ret = "Herzog";
                break;
            case 41 :
                ret = "Hirtzel";
                break;
            case 42 :
                ret = "Hoch";
                break;
            case 43 :
                ret = "Hoefer";
                break;
            case 44 :
                ret = "Hofstetter";
                break;
            case 45 :
                ret = "Jaeger";
                break;
            case 46 :
                ret = "Jochutz";
                break;
            case 47 :
                ret = "Jutzenbach";
                break;
            case 48 :
                ret = "Kalb";
                break;
            case 49 :
                ret = "Kaltenbach";
                break;
            case 50 :
                ret = "Kraemer";
                break;
            case 51 :
                ret = "Krebs";
                break;
            case 52 :
                ret = "Kuhn";
                break;
            case 53 :
                ret = "Kummel";
                break;
            case 54 :
                ret = "Konig";
                break;
            case 55 :
                ret = "Konlgsamen";
                break;
            case 56 :
                ret = "Iang";
                break;
            case 57 :
                ret = "Iankdorf";
                break;
            case 58 :
                ret = "Liess";
                break;
            case 59 :
                ret = "Lebengut";
                break;
            case 60 :
                ret = "Lutzen";
                break;
            case 61 :
                ret = "Machholt";
                break;
            case 62 :
                ret = "Meusmann";
                break;
            case 63 :
                ret = "Meyer";
                break;
            case 64 :
                ret = "Mohr";
                break;
            case 65 :
                ret = "Muller";
                break;
            case 66 :
                ret = "Nachtmann";
                break;
            case 67 :
                ret = "Naubhof";
                break;
            case 68 :
                ret = "Netzhoch";
                break;
            case 69 :
                ret = "Neumann";
                break;
            case 70 :
                ret = "Niederlitz";
                break;
            case 71 :
                ret = "Nuhr";
                break;
            case 72 :
                ret = "Oberholtzer";
                break;
            case 73 :
                ret = "Ohrsten";
                break;
            case 74 :
                ret = "Otzlowe";
                break;
            case 75 :
                ret = "Reichert";
                break;
            case 76 :
                ret = "Reifneider";
                break;
            case 77 :
                ret = "Riese";
                break;
            case 78 :
                ret = "Rohrig";
                break;
            case 79 :
                ret = "Reiss";
                break;
            case 80 :
                ret = "Schaffer";
                break;
            case 81 :
                ret = "Schaumer";
                break;
            case 82 :
                ret = "Scherer";
                break;
            case 83 :
                ret = "Schultz";
                break;
            case 84 :
                ret = "Schleirmacher";
                break;
            case 85 :
                ret = "Schreiber";
                break;
            case 86 :
                ret = "Schwalb";
                break;
            case 87 :
                ret = "Steiner";
                break;
            case 88 :
                ret = "Tabbeck";
                break;
            case 89 :
                ret = "Teuber";
                break;
            case 90 :
                ret = "Tolzen";
                break;
            case 91 :
                ret = "Trachsel";
                break;
            case 92 :
                ret = "Weber";
                break;
            case 93 :
                ret = "Wechsler";
                break;
            case 94 :
                ret = "Wirtz";
                break;
            case 95 :
                ret = "Widmann";
                break;
            case 96 :
                ret = "Widmer";
                break;
            case 97 :
                ret = "Veit";
                break;
            case 98 :
                ret = "Vogt";
                break;
            case 99 :
                ret = "Vogel";
                break;
            case 100:
                ret = "Zumwald";
                break;
            default:
                ret ="Not Set";
                break;
        }
        return ret;
    }

    @UserFunction(name = "apoc.plotgen.names.humanMale")
    @Description("apoc.plotgen.names.humanMale()")
    public String humanMale() {
        String ret;
        int randNumber;

        Random random = new Random();
        int min = 1;
        int max = 288;
        randNumber = random.nextInt(max - min + 1) + min;
        switch (randNumber) {
            case 1:
                ret = "Abelhard";
                break;
            case 2:
                ret = "Abelhelm";
                break;
            case 3:
                ret = "Admund";
                break;
            case 4:
                ret = "Adred";
                break;
            case 5:
                ret = "Adric";
                break;
            case 6:
                ret = "Agis";
                break;
            case 7:
                ret = "Alaric";
                break;
            case 8:
                ret = "Alberic";
                break;
            case 9:
                ret = "Albrecht";
                break;
            case 10:
                ret = "Aldebrand";
                break;
            case 11:
                ret = "Aldred";
                break;
            case 12:
                ret = "Aldric";
                break;
            case 13:
                ret = "Alfrcld";
                break;
            case 14:
                ret = "Alric";
                break;
            case 15:
                ret = "Altmar";
                break;
            case 16:
                ret = "Andre";
                break;
            case 17:
                ret = "Andred";
                break;
            case 18:
                ret = "Andric";
                break;
            case 19:
                ret = "Anshelm";
                break;
            case 20:
                ret = "Anton";
                break;
            case 21:
                ret = "Arne";
                break;
            case 22:
                ret = "Arnulf";
                break;
            case 23:
                ret = "Axel";
                break;
            case 24:
                ret = "Axelbrand";
                break;
            case 25:
                ret = "Baldred";
                break;
            case 26:
                ret = "Baldric";
                break;
            case 27:
                ret = "Baldwin";
                break;
            case 28:
                ret = "Balthasar";
                break;
            case 29:
                ret = "Barnabas";
                break;
            case 30:
                ret = "Barr";
                break;
            case 31:
                ret = "Barrolf";
                break;
            case 32:
                ret = "Bartomar";
                break;
            case 33:
                ret = "Bernolr";
                break;
            case 34:
                ret = "Berrold";
                break;
            case 35:
                ret = "Bertolf";
                break;
            case 36:
                ret = "Boris";
                break;
            case 37:
                ret = "Bruno";
                break;
            case 38:
                ret = "Burgolf";
                break;
            case 39:
                ret = "Calvin";
                break;
            case 40:
                ret = "Casimir";
                break;
            case 41:
                ret = "Caspar";
                break;
            case 42:
                ret = "Cedred";
                break;
            case 43:
                ret = "Conrad";
                break;
            case 44:
                ret = "Corvin";
                break;
            case 45:
                ret = "Dagmar";
                break;
            case 46:
                ret = "Dankmar";
                break;
            case 47:
                ret = "Dankred";
                break;
            case 48:
                ret = "Dekmar";
                break;
            case 49:
                ret = "Detlef";
                break;
            case 50:
                ret = "Diebold";
                break;
            case 51:
                ret = "Diel";
                break;
            case 52:
                ret = "Diermar";
                break;
            case 53:
                ret = "Dieter";
                break;
            case 54:
                ret = "Dietfried";
                break;
            case 55:
                ret = "Dietmund";
                break;
            case 56:
                ret = "Dietrich";
                break;
            case 57:
                ret = "Dirk";
                break;
            case 58:
                ret = "Donat";
                break;
            case 59:
                ret = "Durnhelm";
                break;
            case 60:
                ret = "Eber";
                break;
            case 61:
                ret = "Eckel";
                break;
            case 62:
                ret = "Eckhart";
                break;
            case 63:
                ret = "Edgar";
                break;
            case 64:
                ret = "Edmund";
                break;
            case 65:
                ret = "Edwin";
                break;
            case 66:
                ret = "Ehrharr";
                break;
            case 67:
                ret = "Ehrl";
                break;
            case 68:
                ret = "Ehrwig";
                break;
            case 69:
                ret = "Eldred";
                break;
            case 70:
                ret = "Elmeric";
                break;
            case 71:
                ret = "Emil";
                break;
            case 72:
                ret = "Engel";
                break;
            case 73:
                ret = "Engelbert";
                break;
            case 74:
                ret = "Engelbrechr";
                break;
            case 75:
                ret = "Engelhart";
                break;
            case 76:
                ret = "Eodred";
                break;
            case 77:
                ret = "Eomund";
                break;
            case 78:
                ret = "Erasmus";
                break;
            case 79:
                ret = "Erdman";
                break;
            case 80:
                ret = "Erdred";
                break;
            case 81:
                ret = "Erich";
                break;
            case 82:
                ret = "Erkenbrand";
                break;
            case 83:
                ret = "Erman";
                break;
            case 84:
                ret = "Ernsr";
                break;
            case 85:
                ret = "Erwin";
                break;
            case 86:
                ret = "Eugen";
                break;
            case 87:
                ret = "Eusrasius";
                break;
            case 88:
                ret = "Ewald";
                break;
            case 89:
                ret = "Fabian";
                break;
            case 90:
                ret = "Faustus";
                break;
            case 91:
                ret = "Felix";
                break;
            case 92:
                ret = "Ferdinand";
                break;
            case 93:
                ret = "Fleugweiner";
                break;
            case 94:
                ret = "Fosten";
                break;
            case 95:
                ret = "Franz";
                break;
            case 96:
                ret = "Frediger";
                break;
            case 97:
                ret = "Fredric";
                break;
            case 98:
                ret = "Friebald";
                break;
            case 99:
                ret = "Friedrich";
                break;
            case 100:
                ret = "Gawin";
                break;
            case 101:
                ret = "Gerber";
                break;
            case 102:
                ret = "Gerharr";
                break;
            case 103:
                ret = "Gerlach";
                break;
            case 104:
                ret = "Gernar";
                break;
            case 105:
                ret = "Gerolf";
                break;
            case 106:
                ret = "Gilbrecht";
                break;
            case 107:
                ret = "Gisberr";
                break;
            case 108:
                ret = "Giselbrecht";
                break;
            case 109:
                ret = "Gismar";
                break;
            case 110:
                ret = "Goran";
                break;
            case 111:
                ret = "Gorrolf";
                break;
            case 112:
                ret = "Gorwin";
                break;
            case 113:
                ret = "Gosberr";
                break;
            case 114:
                ret = "Goswin";
                break;
            case 115:
                ret = "Gotfried";
                break;
            case 116:
                ret = "Gothard";
                break;
            case 117:
                ret = "Gregor";
                break;
            case 118:
                ret = "Greimold";
                break;
            case 119:
                ret = "Griswold";
                break;
            case 120:
                ret = "Grlmwold";
                break;
            case 121:
                ret = "Guido";
                break;
            case 122:
                ret = "Gundolf";
                break;
            case 123:
                ret = "Gundred";
                break;
            case 124:
                ret = "Gunnar";
                break;
            case 125:
                ret = "Gunrer";
                break;
            case 126:
                ret = "Gunther";
                break;
            case 127:
                ret = "Gustaf";
                break;
            case 128:
                ret = "Hadred";
                break;
            case 129:
                ret = "Hadwin";
                break;
            case 130:
                ret = "Hagar";
                break;
            case 131:
                ret = "Hagen";
                break;
            case 132:
                ret = "Haldred";
                break;
            case 133:
                ret = "Halman";
                break;
            case 134:
                ret = "Hamlyn";
                break;
            case 135:
                ret = "Hans";
                break;
            case 136:
                ret = "Harbrand";
                break;
            case 137:
                ret = "Harman";
                break;
            case 138:
                ret = "Harrmann";
                break;
            case 139:
                ret = "Haug";
                break;
            case 140:
                ret = "Heidric";
                break;
            case 141:
                ret = "Heimar";
                break;
            case 142:
                ret = "Heinfried";
                break;
            case 143:
                ret = "Heinman";
                break;
            case 144:
                ret = "Heinrich";
                break;
            case 145:
                ret = "Heinz";
                break;
            case 146:
                ret = "Helmut";
                break;
            case 147:
                ret = "Henlyn";
                break;
            case 148:
                ret = "Hermann";
                break;
            case 149:
                ret = "Herwin";
                break;
            case 150:
                ret = "Hieronymus";
                break;
            case 151:
                ret = "Hildebart";
                break;
            case 152:
                ret = "Hildebrand";
                break;
            case 153:
                ret = "Hildemar";
                break;
            case 154:
                ret = "Hildemund";
                break;
            case 155:
                ret = "Hildred";
                break;
            case 156:
                ret = "Hildric";
                break;
            case 157:
                ret = "Horsr";
                break;
            case 158:
                ret = "Hugo";
                break;
            case 159:
                ret = "Igor";
                break;
            case 160:
                ret = "Iurgen";
                break;
            case 161:
                ret = "Jander";
                break;
            case 162:
                ret = "Jekil";
                break;
            case 163:
                ret = "Jodokus";
                break;
            case 164:
                ret = "Johann";
                break;
            case 165:
                ret = "Jonas";
                break;
            case 166:
                ret = "Jorg";
                break;
            case 167:
                ret = "Jorn";
                break;
            case 168:
                ret = "Josef";
                break;
            case 169:
                ret = "Jost";
                break;
            case 170:
                ret = "Karl";
                break;
            case 171:
                ret = "Kaspar";
                break;
            case 172:
                ret = "Klaus";
                break;
            case 173:
                ret = "Kleber";
                break;
            case 174:
                ret = "Konrad";
                break;
            case 175:
                ret = "Konradin";
                break;
            case 176:
                ret = "Kurt";
                break;
            case 177:
                ret = "Lamprecht";
                break;
            case 178:
                ret = "Lanfried";
                break;
            case 179:
                ret = "Lanric";
                break;
            case 180:
                ret = "Lanwin";
                break;
            case 181:
                ret = "Leo";
                break;
            case 182:
                ret = "Leopold";
                break;
            case 183:
                ret = "Levin";
                break;
            case 184:
                ret = "Liebert";
                break;
            case 185:
                ret = "Liebrechr";
                break;
            case 186:
                ret = "Lienharr";
                break;
            case 187:
                ret = "Linus";
                break;
            case 188:
                ret = "Llebwin";
                break;
            case 189:
                ret = "lngwald";
                break;
            case 190:
                ret = "Lodwig";
                break;
            case 191:
                ret = "Lorhar";
                break;
            case 192:
                ret = "Lucius";
                break;
            case 193:
                ret = "Ludwig";
                break;
            case 194:
                ret = "Luitpold";
                break;
            case 195:
                ret = "Lukas";
                break;
            case 196:
                ret = "Lupold";
                break;
            case 197:
                ret = "Lupus";
                break;
            case 198:
                ret = "Lurher";
                break;
            case 199:
                ret = "Lurolf";
                break;
            case 200:
                ret = "Madred";
                break;
            case 201:
                ret = "Magnus";
                break;
            case 202:
                ret = "Mandred";
                break;
            case 203:
                ret = "Manfred";
                break;
            case 204:
                ret = "Mathias";
                break;
            case 205:
                ret = "Max";
                break;
            case 206:
                ret = "Maximillian";
                break;
            case 207:
                ret = "Meiner";
                break;
            case 208:
                ret = "Meinhart";
                break;
            case 209:
                ret = "Meinolf";
                break;
            case 210:
                ret = "Mekel";
                break;
            case 211:
                ret = "Merkel";
                break;
            case 212:
                ret = "Name";
                break;
            case 213:
                ret = "Name";
                break;
            case 214:
                ret = "Nat";
                break;
            case 215:
                ret = "Nathandar";
                break;
            case 216:
                ret = "Nicodemus";
                break;
            case 217:
                ret = "Odarnar";
                break;
            case 218:
                ret = "Odric";
                break;
            case 219:
                ret = "Odwin";
                break;
            case 220:
                ret = "Olbrecht";
                break;
            case 221:
                ret = "Oldred";
                break;
            case 222:
                ret = "Oldric";
                break;
            case 223:
                ret = "Ortlieb";
                break;
            case 224:
                ret = "Ortolf";
                break;
            case 225:
                ret = "Orwin";
                break;
            case 226:
                ret = "Orwiri";
                break;
            case 227:
                ret = "Osric";
                break;
            case 228:
                ret = "Oswald";
                break;
            case 229:
                ret = "Oswin";
                break;
            case 230:
                ret = "Otfried";
                break;
            case 231:
                ret = "Otto";
                break;
            case 232:
                ret = "Paulus";
                break;
            case 233:
                ret = "Rambrecht";
                break;
            case 234:
                ret = "Ranald";
                break;
            case 235:
                ret = "Randulf";
                break;
            case 236:
                ret = "Ranulf";
                break;
            case 237:
                ret = "Reikhard";
                break;
            case 238:
                ret = "Rein";
                break;
            case 239:
                ret = "Reiner";
                break;
            case 240:
                ret = "Reinhard";
                break;
            case 241:
                ret = "Reinolt";
                break;
            case 242:
                ret = "Reuban";
                break;
            case 243:
                ret = "Rigo";
                break;
            case 244:
                ret = "Roderic";
                break;
            case 245:
                ret = "Rolf";
                break;
            case 246:
                ret = "Ruben";
                break;
            case 247:
                ret = "Rufus";
                break;
            case 248:
                ret = "Ruprecht";
                break;
            case 249:
                ret = "Sebastian";
                break;
            case 250:
                ret = "Semund";
                break;
            case 251:
                ret = "Sepp";
                break;
            case 252:
                ret = "Sieger";
                break;
            case 253:
                ret = "Siegfried";
                break;
            case 254:
                ret = "Siegrnund";
                break;
            case 255:
                ret = "Sigismund";
                break;
            case 256:
                ret = "Sigric";
                break;
            case 257:
                ret = "Srelfan";
                break;
            case 258:
                ret = "Tankred";
                break;
            case 259:
                ret = "Theoderic";
                break;
            case 260:
                ret = "Tilmann";
                break;
            case 261:
                ret = "Udo";
                break;
            case 262:
                ret = "Ulfman";
                break;
            case 263:
                ret = "Ulfred";
                break;
            case 264:
                ret = "Ulli";
                break;
            case 265:
                ret = "Ulman";
                break;
            case 266:
                ret = "Uto";
                break;
            case 267:
                ret = "Valdred";
                break;
            case 268:
                ret = "Valdric";
                break;
            case 269:
                ret = "Varl";
                break;
            case 270:
                ret = "Viggo";
                break;
            case 271:
                ret = "Vikror";
                break;
            case 272:
                ret = "Vilmar";
                break;
            case 273:
                ret = "Volker";
                break;
            case 274:
                ret = "Volkhard";
                break;
            case 275:
                ret = "Walbrechr";
                break;
            case 276:
                ret = "Waldor";
                break;
            case 277:
                ret = "Waldred";
                break;
            case 278:
                ret = "Walther";
                break;
            case 279:
                ret = "Warmund";
                break;
            case 280:
                ret = "Werner";
                break;
            case 281:
                ret = "Wilbert";
                break;
            case 282:
                ret = "Wilfried";
                break;
            case 283:
                ret = "Wilhelm";
                break;
            case 284:
                ret = "Woldred";
                break;
            case 285:
                ret = "Wolfgang";
                break;
            case 286:
                ret = "Wolfhart";
                break;
            case 287:
                ret = "Wolfram";
                break;
            case 288:
                ret = "Wulf";
                break;
            default:
                ret = "Not Set";
        }
        return ret;
    }
}
