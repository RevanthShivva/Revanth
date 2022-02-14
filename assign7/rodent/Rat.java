package com.company.assign7.rodent;



class Rat extends Rodent {
    public Rat(){
        System.out.println("I am a Rat");
    }

    @Override
    void sizeoftail() {
        System.out.println("Rats have long tails");
    }

    @Override
    void typeoffood() {
        System.out.println("Rats eats mainly veg but sometimes flesh");
    }
    public void drugDevelopment(){
        System.out.println("Rats are used for drug development");
    }

}

