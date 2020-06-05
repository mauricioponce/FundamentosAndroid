package com.eme.android.java.polimorphism;

class Dog extends Animal {
    @Override
    void makeNoise() {
        makeGuau();
    }

    private void makeGuau() {
        System.out.println("guau!");
    }
}
