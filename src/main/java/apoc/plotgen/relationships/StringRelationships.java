package apoc.plotgen.relationships;

/**
 * Created by Daniel on 26/04/2017.
 */
public class StringRelationships {
    String uuid = "";
    int numberOfRelationships;
    public StringRelationships(String uuid, int number){
        this.uuid = uuid;
        this.numberOfRelationships = number;
    }

    public StringRelationships(){

    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getNumberOfRelationships() {
        return numberOfRelationships;
    }

    public void setNumberOfRelationships(int numberOfRelationships) {
        this.numberOfRelationships = numberOfRelationships;
    }
}
