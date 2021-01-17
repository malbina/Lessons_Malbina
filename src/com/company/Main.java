package com.company;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi Lesson 19 ");
        Circle circle = new Circle(12,"Pink",true);
        circle.getCircleInfo();
        int n =7;
        circle.setRadius(circle.getRadius() * 7);
        System.out.println(" Dlina kruga: "+ circle.getCircleLenght());
        System.out.println(" Ploshad kruga: " + circle.getCircleArea());

        int size = 100; int count = 0;
      Circle array [] = new Circle[size];

      for ( int i =0; i<array.length; i++){
          array [i] =  new Circle(i+1);
          System.out.print(array[i].getRadius()+" ");
          if (array[i].getRadius()%3==0){
              count++;
          }

      }
        System.out.println();
        System.out.println("______________________________________");

      Circle newArr []= new Circle[count];
      int k=0;

        for( int i =0; i<array.length; i++){
            if(array[i].getRadius()%3== 0) {
               newArr[k]=array[i];
               k++;
            }
        }

      for ( int i = 0 ; i < newArr.length;i++){
          System.out.print(newArr[i].getRadius()+"  ");
      }

    }
}
