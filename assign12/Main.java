package com.company.assign12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Main {

     public static void main(String[] args) {
         Student st1 = new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8);
         Student st2 = new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2);
         Student st17 = new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3);
         Student st3 = new Student(144, "Murali Gowda", 18, "Male","EEE", 2018, 80);
         Student st4 = new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70);
         Student st5 = new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70);
         Student st6 = new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70);
         Student st7 = new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80);
         Student st8 = new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85);
         Student st9 = new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82);
         Student st10 = new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83);
         Student st11= new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4);
         Student st12= new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6);
         Student st13= new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8);
         Student st14= new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4);
         Student st15= new Student(266, "Sanvi Pandey", 17, "Female", "EEE", 2019, 72.4);
         Student st16= new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5);
         ArrayList<Student> studentList = new ArrayList<>();
         studentList.add(st1);
         studentList.add(st2);
         studentList.add(st3);
         studentList.add(st4);
         studentList.add(st5);
         studentList.add(st6);
         studentList.add(st7);
         studentList.add(st8);
         studentList.add(st9);
         studentList.add(st10);
         studentList.add(st11);
         studentList.add(st12);
         studentList.add(st13);
         studentList.add(st14);
         studentList.add(st15);
         studentList.add(st16);
         studentList.add(st17);

         System.out.println("All Departments : ");
         nameOfdepartments task1 = new nameOfdepartments();
         task1.namedepartments(studentList);
         System.out.println("Names ofStudents enrolled after 2018 : ");
         Enrollafter2018 task2 = new Enrollafter2018();
         task2.enroll2018(studentList);
         MalesofCSE task3 = new MalesofCSE();
         task3.malesCse(studentList);
         Malefemale malefemale= new Malefemale();
         malefemale.maleFemale(studentList);
         Getavgage getavgage=new Getavgage();
         getavgage.avgAge(studentList);
         //Highestpercent highestpercent = new Highestpercent(studentList);
         Groupbydepartment groupbydepartment = new Groupbydepartment(studentList);
         Averageofdepartment averageofdepartment = new Averageofdepartment(studentList);
         Youngeststudent youngeststudent = new Youngeststudent(studentList);
         Malefemlaecse malefemlaecse = new Malefemlaecse(studentList);
         HighestPercentage highestPercentage = new HighestPercentage(studentList);
     }
}
