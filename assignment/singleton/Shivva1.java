package com.revanth.assignment.singleton;

public class Shivva1 {
    String str ;
    public static Shivva1 method1(String str){

        Shivva1 sh = new Shivva1();
        sh.str = str;
        return sh;
    }
    public void printstring(){
        System.out.println(str);
    }

}
