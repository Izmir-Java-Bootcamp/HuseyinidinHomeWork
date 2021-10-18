package com.kodluyoruz;

public class Student {
    private String name;
    private long id;
    private double gpa;
    private PersonelData pd;


    public Student(String name, long id, double gpa, PersonelData pd) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.pd = pd;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public PersonelData getPd() {
        return pd;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.name + '\'' +
                ", id=" + this.id +
                ", gpa=" + this.gpa +
                ", pd=" + this.pd +
                '}';
    }
}
