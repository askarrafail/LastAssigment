package com.company;

public class Teacher implements Iterable {
    private double Level;
    private int Salary;
    private String  NameOfTeacher;

    public Teacher() {
        System.out.println("i do  work at school");
    }

    public Teacher(double Level, int salary, String NameOfTeacher) {
        this.Level = Level;
        this.Salary = salary;
        this.NameOfTeacher = NameOfTeacher;
    }

    public void study(){
        System.out.println("I am teacher");
    }

    public String checkMood(){
        if (Salary >= 1000 && Salary <= 1200) return "You are a king!"; if (Salary < 800 && Salary >= 600) return "Still very good!"; if (Salary < 500 && Salary >= 200) return "Pretty okay";
        if (Salary < 200 && Salary >= 0) return "Pretty Disaster";
        return "Study hard  and work ";

    }


@Override
public void dejob() {
    System.out.println("study hard please");
}

    @Override
    public String toString() {
        return "Student{" +
                "Level=" + Level +
                ", Salary=" + Salary +
                ", NameOfTeacher=" + NameOfTeacher +
                '}';
    }
}
