package com.company;
import java.io.File;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);

        System.out.print("Directory: C:\\Users\\shivv");
        //Creating a file called directory and it is pointing to home directory in my laptop.
        File directory = new File("C:\\Users\\shivv");

        // To take user input continuously, I am running a while loop.
        while(true){
            //Taking user input for which it is having specific extensions(".exe",".git").
            String file_to_search = scan.next();
            // Running through the directory and checking whether it is having the desired extension files
            for(File file_name : directory.listFiles()){
               if(file_name.getName().contains(file_to_search)){
                   System.out.println(file_name.getAbsolutePath());
               }
            }
           // Running through the directory and checking whether it is having the desired files.
           for(File file_name : directory.listFiles()){
              if(file_name.getName() == file_to_search) {
                  //getAbsolutePath prints the entire path.
                  System.out.println(file_name.getAbsolutePath());
              }
            }
        }
    }
}