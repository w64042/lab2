package javaapplication2;
//2
public class Prostokat {

    float dlugosc;
    float szerokosc;

    public Prostokat(float dlugosc, float szerokosc) {
        if (dlugosc < 0 || szerokosc < 0){
            System.out.println("Długość lub szerokość mniejsza od 0");
        }else{
            this.dlugosc = dlugosc;
            this.szerokosc = szerokosc;
        }

    }

    public void setDlugosc(float dlugosc) {
        this.dlugosc = dlugosc;
    }

    public void setSzerokosc(float szerokosc) {
        this.szerokosc = szerokosc;
    }
    public float pole(float a,float b){
        return a*b;
    }
    public float obwod(float a,float b){
        return (2*a)+(2*b);
    }
    public float przekatna(float a,float b){
        return (float) Math.sqrt(Math.pow(dlugosc,2) + Math.pow(szerokosc,2));
    }

}
