package com.company;

public class IntervalleFerme extends Intervalle {
    public boolean contient(int v) {
        return v >= min & v <= max;
    }

}