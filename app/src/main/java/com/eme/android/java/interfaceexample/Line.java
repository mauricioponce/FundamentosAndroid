package com.eme.android.java.interfaceexample;

class Line implements Shape{

    private double lenght;

    public Line(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public void draw() {
        // TODO implement draw
    }

    public double getLenght() {
        return lenght;
    }
}
