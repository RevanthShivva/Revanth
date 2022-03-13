package com.company.assign12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MalesofCSE {
    public void printclass(List<Student> students) {
        int i =0;
        for (Student stu : students) {
            System.out.println(students.get(i).getName()+ " " + students.get(i).getEngDepartment() + students.get(i).getId());
            i++;
        }
    }
    public void malesCse(List<Student> students){
        List<Student> stu = students.stream().filter(s->s.gender.equals("Male")).filter(s->s.getEngDepartment().equals("Computer Science")).collect(Collectors.toList());
        MalesofCSE malesofCSE = new MalesofCSE();
        malesofCSE.printclass(stu);
        }
    }



