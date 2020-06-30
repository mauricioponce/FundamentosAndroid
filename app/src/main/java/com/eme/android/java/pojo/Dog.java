package com.eme.android.java.pojo;

class Dog {
    // Peso del perro en KG
    private double weight;

    // Género del perro: macho / hembra
    private String gender;

    // Edad
    private int age;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
