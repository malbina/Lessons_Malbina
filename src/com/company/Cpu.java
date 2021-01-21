package com.company;

public class Cpu {
      String model;
      int numberOfCares;
      double frequency;

      public Cpu (String model, int numberOfCares,double frequency){
          this.model = model;
          this.numberOfCares = numberOfCares;
          this.frequency = frequency;
      }
      public void printInfo (){
          System.out.println("Cpu: model -"+getModel()+", number of cares -"+getNumberOfCares()+", frequency-"+getFrequency());
      }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfCares() {
        return numberOfCares;
    }

    public void setNumberOfCares(int numberOfCares) {
        this.numberOfCares = numberOfCares;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
}
