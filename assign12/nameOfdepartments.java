package com.company.assign12;

import java.util.List;

class nameOfdepartments {
     public void  namedepartments(List<Student> students){
         students.stream().map(Student::getEngDepartment).distinct().forEach(System.out::println);

     }
}
