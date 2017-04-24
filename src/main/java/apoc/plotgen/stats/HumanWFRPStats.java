package apoc.plotgen.stats;

import apoc.plotgen.random.Dice;

/**
 * Created by Daniel on 24/04/2017.
 */
public class HumanWFRPStats extends WFRPStats {
    void HumanWFRPStats () {

    }

    public void rollStats() {
        setWs((int)Dice.roll("2D10+20"));
        setBs((int)Dice.roll("2D10+20"));
        setS((int)Dice.roll("2D10+20"));
        setT((int)Dice.roll("2D10+20"));
        setAg((int)Dice.roll("2D10+20"));
        setInt((int)Dice.roll("2D10+20"));
        setWp((int)Dice.roll("2D10+20"));
        setFel((int)Dice.roll("2D10+20"));
        setA(1);
        setW(generateWounds());
        setSb();
        setTb();
        setM(4);
        setMag(0);
        setIp(0);
        setFp(0);
    }

    int generateWounds() {
        int rn = (int)Dice.roll("1D10");

        if((rn >= 1) && (rn <= 3)) {
            return 10;
        }

        if((rn >= 4) && (rn <= 6)) {
            return 11;
        }

        if((rn >= 7) && (rn <= 9)) {
            return 12;
        }

        if((rn >= 10) && (rn <= 10)) {
            return 13;
        }

        return 0;
    }
}
