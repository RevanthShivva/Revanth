package com.company.assign12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Groupbydepartment {

     public Groupbydepartment(List<Student> students){
        Map<String,List<Student>> group = students.stream().collect(Collectors.groupingBy(s->s.getEngDepartment()));
        int i =0;
        for(Map.Entry mapElement : group.entrySet()){
            List<Student> s = (List<Student>) mapElement.getValue();
            int n = s.size();
            System.out.println(mapElement.getKey() + " Strength is : " + n);
        }


     }
}
