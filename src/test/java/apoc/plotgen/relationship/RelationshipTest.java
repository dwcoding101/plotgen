package apoc.plotgen.relationship;

import apoc.plotgen.relationships.StringRelationships;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Daniel on 26/04/2017.
 */
public class RelationshipTest {

   static ArrayList<StringRelationships> testArray = new ArrayList<>();

    public static void main(String[] args) {
        testArray.add(new StringRelationships("1",3));
        testArray.add(new StringRelationships("2",3));
        testArray.add(new StringRelationships("3",3));
        testArray.add(new StringRelationships("4",4));
        testArray.add(new StringRelationships("5",2));
        testArray.add(new StringRelationships("6",3));
        testArray.add(new StringRelationships("7",3));
        testArray.add(new StringRelationships("8",4));
        testArray.add(new StringRelationships("9",2));
        testArray.add(new StringRelationships("10",1));
        testArray.add(new StringRelationships("11",3));
        int numberOfPeopleKnow;
        boolean cont = true;
        List<StringRelationships> knowNPCList;
        while (cont) {
            StringRelationships workingStringRelationships = testArray.get(0);
            testArray.remove(0);
            numberOfPeopleKnow = workingStringRelationships.getNumberOfRelationships();

            knowNPCList = pickNRandom(testArray, numberOfPeopleKnow);

            // add in the relationships
            knowNPCList.forEach((known) -> {
                //    String knowQuerry = "MATCH (a:NPC),(b:NPC) WHERE a.uuid='" + workingStringRelationships.getUuid() + "' AND b.uuid='" + known.getUuid() + "' WITH a,b MERGE (a)-[:KNOWS_OF]->(b) WITH a,b MERGE (b)-[:KNOWS_OF]->(a)";
                //        try (Result result = db.execute(knowQuerry)) {

                //      }
            });

            testArray = reduceKnow(testArray,knowNPCList);

            if(testArray.size()<=1){
                cont = false;
            }

        }
    }

    public static ArrayList<StringRelationships> reduceKnow(List<StringRelationships> list, List<StringRelationships> known ) {
        known.forEach((person)->{
            list.forEach((mainPerson)-> {
                if(mainPerson.getUuid().equals(person.getUuid())){
                    mainPerson.setNumberOfRelationships(mainPerson.getNumberOfRelationships()-1);
                }
            });
        });

        // remove all zero relationships
        ArrayList<StringRelationships> ret = new ArrayList<>();
        list.forEach((mainPerson)->{
            if (mainPerson.getNumberOfRelationships() >= 1) {
                ret.add(mainPerson);
            }
        });

        return ret;
    }

    public static List<StringRelationships> pickNRandom(ArrayList<StringRelationships> lst, int n) {
        List<StringRelationships> copy = new LinkedList<StringRelationships>(lst);
        Collections.shuffle(copy);
        return copy.subList(0, n);
    }



}
