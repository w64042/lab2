package javaapplication2;

public class Human {
    int age;
    int weight;
    int height;
    String imie;
    boolean sex;

    public Human(int age, int weight, int height, String imie, boolean sex) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.imie = imie;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
    public boolean isMale(){
        return sex == true ? true : false;
    }
}
