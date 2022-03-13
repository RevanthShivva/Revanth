package com.company.assign7.motor;

public class Main {
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle  tricycle = new Tricycle();
        Cycle[] cycle = new Cycle[3];
        cycle[0]= unicycle;
        cycle[1] = bicycle;
        cycle[2] = tricycle;
        //We cannot call balance method using parent class reference because of upcasting. Only
        //parent class methods and overriden methods can ba called;
        //cycle[0].balance();
        Unicycle uni = (Unicycle)cycle[0];
        uni.balance();
        Bicycle bic = (Bicycle) cycle[1];
        bic.balance();
    }
}