package com.company.assign7.rodent;



class Mice extends Rodent {
    public Mice(){
        System.out.println("I am a Mice");
    }

    @Override
    void sizeoftail() {
        System.out.println("Mice have medium sized tails");
    }

    @Override
    void typeoffood() {
        System.out.println("Mice are pure vegetarians");
    }
    public void livingplace(){
        System.out.println("Mice live in burrows in soil or in human areas");
    }
}
