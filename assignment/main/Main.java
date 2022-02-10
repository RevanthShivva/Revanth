package com.revanth.assignment.main;

import com.revanth.assignment.data.Shivva;
import com.revanth.assignment.singleton.Shivva1;

public class Main {
    public static void main(String[] args) {


        Shivva shivva = new Shivva();
        shivva.printVariables();
        /* here in this part the compiler gives error because java does not support uninitialized local variables.
        They have to be initialized before their first use. Because there will be uncertainty in where these
        local variables are declared
         */
        shivva.localVariables();
        Shivva1 sh1 = Shivva1.method1("Revanth");
        sh1.printstring();

    }
}
