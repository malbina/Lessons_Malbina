package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args)  {
        ArrayList<Integer>list =new ArrayList<>();
        list.add(15);
        list.add(78);
        list.add(67);
        System.out.println(list.get(1));
        System.out.println(list);
        System.out.println("List size: "+list.size());

        List<Integer> sqrs =new ArrayList<>();
        int max =10000;
        double maxSqr =Math.sqrt(max);
        for (int i =1;i<=maxSqr;i++){
            sqrs.add(i*i);
        }
        System.out.println(sqrs);
        //Task 2
        System.out.println("Task 2");
        List<Integer>sortedList =new ArrayList<>();
        int maxBound = 100;
        for (int i = 1;i<=100;i++){
            if(i%2!=0){
                sortedList.add(0,i);
            }
            else{
                sortedList.add(i);
            }System.out.println(sortedList);

        }
        System.out.println(sortedList);

        System.out.println("Task 3");
        System.out.println("------------------------------------");
        List<Integer>newList =new ArrayList<>();

        for (int i =0;i<sqrs.size();i++){
            int currentEl = sqrs.get(i);
            if(currentEl%2==0||currentEl%3==0){
                newList.add(i);
            }

        }
        System.out.println(newList);
        System.out.println("\n\nTASK 4");
        for (int i =0; i<sortedList.size();i++){
            if(sortedList.get(i)%2==0)
                sortedList.remove(i--);

        }

        System.out.println(sortedList);
        System.out.println("Creating an array from ArrayList  to array ");
        Integer [] ints =sortedList.toArray(new Integer[sortedList.size()]);
        for(Integer i :ints ){
            System.out.print(i+" ");
        }
        System.out.println("Creating from the Array the ArrayList");
        List<Integer> arr = Arrays.asList(ints);

















     }

    }



