package com.company;

public class Hdd {
    int size;
    int speed;


    public Hdd (int size , int speed){
        this.size = size;
        this.speed = speed;

    }
    public void printInfo (){
        System.out.println("Hdd: size -"+getSize()+", speed -"+getSpeed());
    }


    public Hdd (){}
    public void setSize ( int size){
        this.size = size;
    }
    public int getSize (){
        return size;
    }
    public void  setSpeed( int speed){
        this.speed = speed;
    }
    public int getSpeed (){
        return speed;
    }

}
