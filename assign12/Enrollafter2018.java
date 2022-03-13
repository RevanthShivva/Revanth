package com.company.assign12;

import java.util.List;

class Enrollafter2018 {
    public void enroll2018(List<Student> students){
        students.stream().filter(s->s.getYear_of_enrollment()>2018).map(Student::getName).forEach(System.out::println);
    }
}
