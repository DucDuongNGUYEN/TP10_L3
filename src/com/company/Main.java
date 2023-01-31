package com.company;

public class Main {

    public static void main(String[] args) {
        Intervalle intervalle = new IntervalleFerme();
        intervalle.changerBornes(2,6);
        Test.testContient(5);
        Test.testIntervalle(intervalle);
    }

}
