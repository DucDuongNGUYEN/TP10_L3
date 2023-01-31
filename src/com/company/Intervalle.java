package com.company;

public abstract class Intervalle {
    protected int min;
    protected int max;

    void changerBornes(int min, int max){
        this.min = min;
        this.max = max;
    }
    abstract boolean contient(int v);
}

