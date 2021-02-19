package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

//       Swimmable oceanarium []=new Swimmable[15];
//        for (int i =0;i<oceanarium.length; i++){
//            if(i<5) oceanarium[i]=new Turtle();
//            else if (i<10) oceanarium[i]=new Shark();
//            else oceanarium[i]=new Duck();
//            oceanarium [i].makeSound();
//        }
//        for(int i =0; i<oceanarium.length;i++){
//            if(oceanarium[i]instanceof Shark)
//                ((Shark) oceanarium[i]).hunt();
//            else if (oceanarium[i] instanceof Turtle)
//                ( (Turtle) oceanarium[i]).layEggs(i);
//            System.out.println(oceanarium[i].getClass());
//        }
//        Turtle turtles []=new Turtle[5];
//        Shark sharks []= new Shark[5];
//        Duck ducks []=new Duck[5];
//        int iTurtle =0;
//        int iShark =0;
//        int iDuck=0;
//
//        for (Swimmable animal : oceanarium){
//            if(animal instanceof Turtle)
//                turtles[iTurtle++]=(Turtle) animal;
//            else if (animal instanceof Shark )
//                sharks[iShark++]=(Shark) animal;
//            else ducks[iDuck++]=(Duck) animal;
//        }
        FileWriter fileWriter = new FileWriter("myFirstFile.txt");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            fileWriter.write(ch + " ");
        }
        fileWriter.write("\n");

        for (int i = 0; i < 10; i++) {
            fileWriter.write(i + "\n");
        }
        fileWriter.close();


        FileReader fileReader = new FileReader("myFirstFile.txt");
        Scanner sc = new Scanner(fileReader);
//     int i =1;
//     while(sc.hasNextLine()){
//         System.out.println(sc.nextLine());
//         i++;
//     }
//        FileWriter fileWriter1 = new FileWriter("file3.txt");
//        for (int i =1; sc.hasNextLine(); i++){
//            String line=sc.nextLine();
//            if(i%3==0)
//                fileWriter1.write(line);
//                System.out.println(line);
//        }
//        fileReader.close();
//        fileWriter1.close();
//
//        try {
//            int[] array = {1, 2, 3};
//            System.out.println(array[100]);
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println("Вы вышли из пределов массива");
//            System.out.println(ex);
//            ex.printStackTrace();
//            System.out.println("---------------------");
//        }
//        double a=7;
//        if(Math.sqrt(a)!=(int)Math.sqrt(a)){
//            throw new Error();
////        }
//        try {
//            Object o =null;
//            raiser(
//                    o
//            );// exception -end of try;
//
//        }
//        catch (NullPointerException npe){
//            System.out.println("Gotcha" +
//                    "");
//            npe.printStackTrace();
//        }
//        System.out.println("Continue");
//        System.out.println("___________________");


        Cat[] array = {new Cat("Kai"),null, new Cat("Eli"), new Cat("Kaili"), null, new Cat("Happy"), new Cat("Lial")};
        for (int i =0;i<array.length;i++ ){
//            try {
                System.out.println(array[i].getName());
                System.out.println(array[i+1].getName());
//
//            }
//            catch (NullPointerException npe){
//                System.out.println("Caught NullPointerException");
//                npe.printStackTrace();
//        }
//            catch (ArrayIndexOutOfBoundsException ex ){
//                System.out.println("Caught ArrayIndexOutOfBoundsException");
//                ex.printStackTrace();
//            }
//            finally {
//                System.out.println("I will be printed anyway~");
//            }
    }

        System.out.println("End of this Program");
















     }
//    }
//    public static void raiser (Object o ) throws NullPointerException{
//        if (o==null){
//            throw new NullPointerException();
//     }   }
    }



