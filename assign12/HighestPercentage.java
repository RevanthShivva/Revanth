package com.company.assign12;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

class HighestPercentage {
     public HighestPercentage(List<Student> students){
         Optional<Student> highestPercentage = students.stream().collect(Collectors.maxBy(Comparator.comparing(Student::getPerTillDate)));
         System.out.println("Details of Student having highest percentage : ");
         System.out.println(highestPercentage);
     }
}
