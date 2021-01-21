package com.company;

public class Main {

    public static void main(String[] args) {

     Hdd hdd1 = new Hdd(500,250);
     Os os1 = new Os("windows","1.4");
     Ram ram1 = new Ram(12,"model");
     Cpu cpu1 = new Cpu("model",15,2.4);
     Notebook note = new Notebook (hdd1,cpu1,os1,ram1);
     note.printInfo();
    }
}
