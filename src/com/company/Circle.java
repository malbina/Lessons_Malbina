package com.company;

public class Circle {
    double  radius;
    String color;
    boolean IsSee;

    public Circle ( double radius){
        this.radius = radius;
    }
    public Circle ( double radius , String color){
    this.radius =  radius;
    this.color =color;
    }
    public  Circle ( double radius, String color, boolean isSee){
        this.radius = radius;
        this.color = color;
        this.IsSee=isSee;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setSee(boolean see) {
        IsSee = see;
    }

    public boolean getIsSee() {
        return IsSee;
    }
    public double getCircleLenght ( ){
     return 2*Math.PI*radius;
    }
    public double getCircleArea ( ){
        return Math.PI*radius*radius;
    }

    public void getCircleInfo (){
        System.out.println("circle: \n\n radius: " + getRadius()+"\n color: "+getColor()+"\n is transparet: "+getIsSee());
    }

}


