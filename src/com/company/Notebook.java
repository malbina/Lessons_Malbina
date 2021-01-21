package com.company;

public class Notebook {
    Hdd hdd;
    Cpu cpu;
    Os os;
    Ram ram;

    Notebook (){}

    public Notebook(Hdd hdd, Cpu cpu, Os os, Ram ram) {
        this.hdd = hdd;
        this.cpu = cpu;
        this.os = os;
        this.ram = ram;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void printInfo(){
        System.out.println("Notebook: ");
        hdd.printInfo();
        cpu.printInfo();
        os.printInfo();
        ram.printInfo();
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Os getOs() {
        return os;
    }

    public void setOs(Os os) {
        this.os = os;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }
}
