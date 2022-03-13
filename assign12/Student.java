package com.company.assign12;

import java.util.List;

class Student {
    public int  id;
    public String name;
    public int age;
    public String gender;
    public String engDepartment;
    public int year_of_enrollment ;
    public double perTillDate;
    public Student(int  id,String name, int age, String gender, String engDepartment, int year_of_enrollment , double perTillDate){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.year_of_enrollment = year_of_enrollment;
        this.perTillDate = perTillDate;
    }
    public  String getEngDepartment() {
        return engDepartment;
    }
    public int getYear_of_enrollment(){
        return year_of_enrollment;
    }

   public String getName(){
        return name;
   }

     public double getPerTillDate() {
         return perTillDate;
     }
     public String getGender(){
        return gender;

     }

    public int getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
    public Student getStudent(Student student){
        return student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", engDepartment='" + engDepartment + '\'' +
                ", year_of_enrollment=" + year_of_enrollment +
                ", perTillDate=" + perTillDate +
                '}';
    }
}
