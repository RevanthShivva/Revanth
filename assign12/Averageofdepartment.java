package com.company.assign12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Averageofdepartment {
    public Averageofdepartment(List<Student> students){
        Map<String,List<Student>> group = students.stream().collect(Collectors.groupingBy(s->s.getEngDepartment()));
        for(Map.Entry mapElement : group.entrySet()){
            List<Student> s = (List<Student>) mapElement.getValue();
             Double averagePercentage =  s.stream().collect(Collectors.averagingInt(student-> (int) student.getPerTillDate()));
            System.out.println(mapElement.getKey() + " Average percentage achieved is : "+ averagePercentage);
        }
    }
}
