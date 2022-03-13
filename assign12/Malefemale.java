package com.company.assign12;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Malefemale {
    public void maleFemale(List<Student> students){
        List<String> male = students.stream().filter(s->s.getGender().equals("Male")).map(Student::getGender).collect(Collectors.toList());
        System.out.println("No of Males : " + male.size());
        List<String> female = students.stream().filter(s->s.getGender().equals("Female")).map(Student::getGender).collect(Collectors.toList());
        System.out.println("No of Feales : " + female.size());
    }
}
