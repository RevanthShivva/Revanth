package com.company.assign12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Malefemlaecse {
    public Malefemlaecse(List<Student> students){
       Map<String,List<Student>> local =students.stream().filter(s->s.getEngDepartment().equals("Computer Science")).collect(Collectors.groupingBy(s->s.getGender()));
       for(Map.Entry mapElement : local.entrySet()){
             List<Student> local1 = (List<Student>) mapElement.getValue();
            int n = (int) local1.stream().count();
           System.out.println("No of "+mapElement.getKey() +" students in CSE department is : " + n);
       }
    }
}
