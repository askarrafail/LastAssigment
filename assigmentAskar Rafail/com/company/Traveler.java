package com.company;

public class Traveler implements Iterable {
    private int age;
    private int country;
    private String name;

    public Traveler() {
        System.out.println("I am traveller");
    }

    public Traveler(int age, int country, String name) {
        this.age = age;
        this.country = country;
        this.name = name;
    }

    public void getOlder(){
        age--;
    }

    public void visited(){
        System.out.println("Visited too many countries");
    }



@Override
public void dejob() {
    System.out.println("travel a lot ");
}


    @Override
    public String toString() {
        return "Traveler{" +
                "age=" + age +
                ", salary=" + country +
                ", name='" + name + '\'' +
                '}';
    }
}
