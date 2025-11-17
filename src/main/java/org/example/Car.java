package org.example;

public class Car {
    Engine engine;

    // Injecting the Engine object into Car
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    void drive(){
        int start = engine.start();
        if(start>0){
            System.out.println("Car Started...");
        }
        else{
            System.out.println("Car not started...");
        }
    }
}

