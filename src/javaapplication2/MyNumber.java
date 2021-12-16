package javaapplication2;
//3
public class MyNumber {
    private int liczba;

    public MyNumber(int liczba) {
        this.liczba = liczba;
    }
    public boolean isOdd(int a){
        return a%2==1;
    }
    public boolean isEven(int a){
        return !isOdd(a);
    }
    public int sqrt(int a){
        return (int) Math.sqrt(a);
    }
    public MyNumber pow(MyNumber x) {
        return new MyNumber((int) Math.pow(liczba, x.liczba));
    }
    public MyNumber add(MyNumber x) {
        return new MyNumber(liczba + x.liczba);
    }

    public MyNumber subract(MyNumber x) {
        return new MyNumber(liczba - x.liczba);
    }
}
