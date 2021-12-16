package javaapplication2;

public class Okrag{
    int r;
    int x;
    int y;
    Punkt srodek;


    public Okrag() {

    }

    public Okrag(int x, int y, int r) {
        this.r= r;
        this.srodek = new Punkt(x,y);
    }


    public double getPowierzchnia() {
        return (3.14 * r * r);
    }

    public double getObwod() {
        return 2 * (3.14 * r);
    }

    public int getpromien() {
        return r;
    }

    public int getSrednica() {
        return 2*getpromien();
    }


    public boolean wSrodku(int x2, int y2) {
        double distance = Math.sqrt(Math.pow(srodek.x- x2,2) + Math.pow(srodek.y-y2,2));

        return distance <= r;
    }
}
