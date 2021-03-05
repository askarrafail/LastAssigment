package com.company;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;



public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException, NoSuchFieldException {
 Iterable iterable = new Iterable() {

     @Override
     public void dejob() {
         System.out.println(" Try to upgrade");
     }
 };
  Iterable.LetGo();




        final Traveler traveler = Traveler.class.getConstructor(int.class, int.class, String.class).newInstance(45, 240, "Logan");
        Field travelerAge = Traveler.class.getDeclaredField("age");
        Field travelerSalary = Traveler.class.getDeclaredField("country");
        Field travelerName = Traveler.class.getDeclaredField("name");
        System.out.println(travelerAge + " " + travelerSalary + " " + travelerName); System.out.println(traveler); System.out.println();
        //
        //
        final Teacher teacher = Teacher.class.getConstructor(double.class, int.class, String.class).newInstance(99.5, 950, "Maxim");
        Field teacherLevel = Teacher.class.getDeclaredField("Level");
        Field teacherSalary = Teacher.class.getDeclaredField("Salary");
        Field teacherNameOfTeacher= Teacher.class.getDeclaredField("NameOfTeacher");
        System.out.println(teacherLevel + " " + teacherSalary + " " + teacherNameOfTeacher);
        System.out.println(teacher);

    }
}
