package com.eme.android.java.interfaceexample;

public class Circle implements Shape {

    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    @Override
    public void draw() {
        // TODO implement draw
    }

    public double getRadio() {
        return radio;
    }
}
