package com.kodluyoruz;


public class Main {

    public static void main(String[] args) {


        Student student0 = new Student("Hakan",5005,3.50,new PersonelData(1995,5,10,445));
        Student student1 = new Student("Murat",5006,2.88,new PersonelData(1994,10,15,835));
        Student student2 = new Student("Fatma",5007,3.75,new PersonelData(1997,2,28,246));
        Student student3 = new Student("Turgut",5008,3.80,new PersonelData(1996,7,2,664));
        Student student4 = new Student("Melis",5009,3.70,new PersonelData(1992,12,24,725));

        Course course = new Course("K129",3);

        course.addStudent(student0);
        course.addStudent(student1);
        course.addStudent(student2);
        course.addStudent(student3);

        course.list();

        course.increaseCapacity();

        course.addStudent(student3);
        course.addStudent(student4);

        course.list();

        course.dropStudent(student0);

        course.list();

        System.out.println(course.getNumberOfStudent());

        System.out.println(course.getBestStudent().getPd().getBirthDate().getYear());

        Course course1 = new Course("K130" , 5);

        Student[] students = course.getStudents();
        for(int i=0; i < course.getNumberOfStudent(); i++)
            course1.addStudent(students[i]);

        course.clear();

        System.out.println("--------------------");
        System.out.println("\nStudent with ID 5005 is dropped from " + course.getCourseName() + " is " + course.dropStudent(student0));

        course1.list();

        System.out.println("The best student is "+course1.getBestStudent()+" in K130 \n");

        course1.list();

        System.out.println("The GPA of youngest student is "+course1.getYoungestStudent().getGpa()+" in K130");

        System.out.println("\nAll students of " + course.getCourseName() + ": ");
        course.list();
        System.out.println("\nAll students of " + course1.getCourseName() + ": ");
        course1.list();
    }
}
