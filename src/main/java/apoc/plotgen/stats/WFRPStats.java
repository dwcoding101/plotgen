package apoc.plotgen.stats;

/**
 * Created by Daniel on 24/04/2017.
 */
public abstract class WFRPStats {
    private int ws;
    private int bs;
    private int s;
    private int t;
    private int ag;
    private int Int;
    private int wp;
    private int fel;
    private int a;
    private int w;
    private int sb;
    private int tb;
    private int m;
    private int mag;
    private int ip;
    private int fp;

    public int getWs() {
        return ws;
    }

    public void setWs(int ws) {
        this.ws = ws;
    }

    public int getBs() {
        return bs;
    }

    public void setBs(int bs) {
        this.bs = bs;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getAg() {
        return ag;
    }

    public void setAg(int ag) {
        this.ag = ag;
    }

    public int getInt() {
        return Int;
    }

    public void setInt(int anInt) {
        Int = anInt;
    }

    public int getWp() {
        return wp;
    }

    public void setWp(int wp) {
        this.wp = wp;
    }

    public int getFel() {
        return fel;
    }

    public void setFel(int fel) {
        this.fel = fel;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getSb() {
        return sb;
    }

    public void setSb() {
        this.sb = Integer.getInteger(""+Math.floor(s));
    }

    public int getTb() {
        return tb;
    }

    public void setTb() {
        this.tb = Integer.getInteger(""+Math.floor(t));
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getMag() {
        return mag;
    }

    public void setMag(int mag) {
        this.mag = mag;
    }

    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
        this.ip = ip;
    }

    public int getFp() {
        return fp;
    }

    public void setFp(int fp) {
        this.fp = fp;
    }

    public String toString() {
        String ret ="";

        ret = ret + "Ws: " + getWs();
        ret = ret + ", ";
        ret = ret + "Bs: " + getBs();
        ret = ret + ", ";
        ret = ret + "S: " + getS();
        ret = ret + ", ";
        ret = ret + "T: " + getT();
        ret = ret + ", ";
        ret = ret + "Ag: " + getAg();
        ret = ret + ", ";
        ret = ret + "Int: " + getInt();
        ret = ret + ", ";
        ret = ret + "WP: " + getWp();
        ret = ret + ", ";
        ret = ret + "Fel: " + getFel();
        ret = ret + ", ";
        ret = ret + "A: " + getA();
        ret = ret + ", ";
        ret = ret + "W:" + getW();
        ret = ret + ", ";
        ret = ret + "SB:" + getSb();
        ret = ret + ", ";
        ret = ret + "TB:" + getTb();
        ret = ret + ", ";
        ret = ret + "M:" + getM();
        ret = ret + ", ";
        ret = ret + "Mag:" + getMag();
        ret = ret + ", ";
        ret = ret + "IP:" + getIp();



        return ret;
    }
}
