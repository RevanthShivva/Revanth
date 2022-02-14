package com.company.assign7.rodent;



public class Main {
    public static void main(String[] args) {
        Rodent[] rodent = new Rodent[3];
        rodent[0]= new Rat();
        rodent[0].sizeoftail();
        rodent[0].typeoffood();
        rodent[1]= new Hamsters();
        rodent[1].sizeoftail();
        rodent[1].typeoffood();
        rodent[2] = new Mice();
        rodent[2].sizeoftail();
        rodent[2].typeoffood();

    }
}

