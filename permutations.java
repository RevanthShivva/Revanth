package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class permutations {
    public static void main(String[] args) {
        ArrayList<String> firstName = new ArrayList<>();
        ArrayList<String> secondName = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        String name;
        int index;
        for( int i =0;i<5;i++){

            name = read.nextLine();
            index = name.indexOf(" ");
            String first = name.substring(0,index);
            firstName.add(first);
            String second = name.substring(index+1);
            secondName.add(second);
        }
        for(int i =0;i<5;i++){

            for(int j =0;j<5;j++){
                System.out.println(firstName.get(i) + " " + secondName.get(j));

            }

        }
    }
}

