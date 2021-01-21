package com.company;

public class Ram {
    int size;
    String model;

    public Ram (){}
    public Ram (int size, String model){
        this.size = size;
        this.model = model;
    }
    public void printInfo (){
        System.out.println("Ram: size - "+getSize()+", model -"+getSize());
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
