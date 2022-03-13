package com.company.assign12;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.reducing;


public class Youngeststudent {
    public Youngeststudent (List<Student> students){
        Map<String, Map<String, List<Student>>> Rev= students.stream().collect(groupingBy(Student::getEngDepartment, groupingBy(Student::getGender)));
        for(Map.Entry mapElement : Rev.entrySet()) {
            if (mapElement.getKey() == "Electronic") {
                Map<String, List<Student>> local = (Map<String, List<Student>>) mapElement.getValue();
                for(Map.Entry l : local.entrySet()){
                    if(l.getKey()=="Male"){
                        List<Student> local1 = (List<Student>) l.getValue();
                       Optional<Student> local2 =  local1.stream().collect(Collectors.minBy(Comparator.comparing(Student::getAge)));
                        System.out.println(local2);
                    }

                }
            }
        }
    }


}
