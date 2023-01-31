package com.company;

public class Test {
    public static void testIntervalle(Intervalle inter) {
    }

    public static void testContient(int num) {
        Intervalle[] intervalles = new Intervalle[num];
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) intervalles[i] = new IntervalleOuvert();
            else intervalles[i] = new IntervalleFerme();
            intervalles[i].changerBornes(i * 2, i * 4 + 2);
        }
        for (Intervalle intervalle : intervalles)
            System.out.println(intervalle.contient(num));
    }
}