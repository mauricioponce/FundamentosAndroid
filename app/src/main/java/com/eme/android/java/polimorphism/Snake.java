package com.eme.android.java.polimorphism;

class Snake extends Animal{
    private int lenght;

    public Snake(int lenght) {
        this.lenght = lenght;
    }

    @Override
    void makeNoise() {
        makeSssss();
    }

    private void makeSssss() {
        System.out.println("sssssssss");
    }
}
