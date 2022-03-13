package com.company.assign7.rodent;



class Hamsters extends Rodent {
    public Hamsters(){
        System.out.println("I am a Hamster");
    }

    @Override
    void sizeoftail() {
        System.out.println("Hamsters have small sized tails");
    }

    @Override
    void typeoffood() {
        System.out.println("Hamsters are vegetarians");
    }
    void type(){
        System.out.println("Hamsters are nocturnal animals");
    }

}
