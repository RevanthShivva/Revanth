package com.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class parallel {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<5;i++){
            System.out.println("Enter name: ");
            String name_entered = sc.next();
            names.add(name_entered);
            System.out.println("Enter age: ");
            int age_entered = sc.nextInt();
            age.add(age_entered);
        }
        for(int i =0;i<5;i++){
            System.out.println(names.get(i) + " is " + age.get(i) + " years old");
        }
    }
}
