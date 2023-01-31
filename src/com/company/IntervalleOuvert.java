package com.company;

public class IntervalleOuvert extends Intervalle {
    public boolean contient(int v) {
        return v > min & v < max;
    }

}
