package com.company.assign12;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Getavgage {
     public void avgAge(List<Student> students){
         Double ints = students.stream().collect(Collectors.averagingInt(s->s.getAge()));
         System.out.println("Average age is : " + ints);

     }
}
