package com.in.obj;

import java.util.Scanner;

class Car {
    String color;
    int maxSpeed;
    int acceleration;
    int tyreFriction;
    int currentSpeed;
    boolean isEngineStarted;
    
    Car(String carColor, int carMaxSpeed, int carAcceleration, int carTyreFriction){
        this.color = carColor;
        this.maxSpeed = carMaxSpeed;
        this.acceleration = carAcceleration;
        this.tyreFriction = carTyreFriction;
        this.currentSpeed = 0;
        this.isEngineStarted = false;
    }
    
    void startEngine() {
        isEngineStarted = true;
    }
    
    void stopEngine() {
        isEngineStarted = false;
    }
    
    void accelerate() {
        if (isEngineStarted) {
            int newSpeed = currentSpeed + acceleration;
            currentSpeed = Math.min(newSpeed, maxSpeed);
        } else {
            System.out.println("Car has not started yet");
        }
    }
    
    void soundHorn() {
        if (isEngineStarted) {
            System.out.println("Beep Beep");
        } else {
            System.out.println("Car has not started yet");
        }
    }
    
    void applyBrakes() {
        currentSpeed = Math.max(currentSpeed - tyreFriction, 0);
    }
}

class RaceCar extends Car {    
    int nitro;
    
    RaceCar(String carColor, int carMaxSpeed, int carAcceleration, int carTyreFriction, int carNitro) {
        super(carColor, carMaxSpeed, carAcceleration, carTyreFriction);
        this.nitro = carNitro;
    }
    
    @Override
    void accelerate() {
        if (!isEngineStarted) {
            System.out.println("Car has not started yet");
            return;
        }

        int speedIncrease = acceleration;
        if (nitro > 0) {
            speedIncrease += 20;
            nitro--;
        }

        int newSpeed = currentSpeed + speedIncrease;
        currentSpeed = Math.min(newSpeed, maxSpeed);
    }
    
    @Override
    void soundHorn() {
        if (isEngineStarted) {
            System.out.println("Peep Peep");
            System.out.println("Beep Beep");
        } else {
            System.out.println("Car has not started yet");
        }
    }
}

class Base {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RaceCar raceCar = new RaceCar(input.next(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt());
        
        raceCar.startEngine();
        raceCar.accelerate(); 
        System.out.println(raceCar.currentSpeed); // 70
        System.out.println(raceCar.nitro); // 3
        
        raceCar.accelerate(); 
        System.out.println(raceCar.currentSpeed); // 140
        System.out.println(raceCar.nitro); // 2
        
        raceCar.accelerate(); 
        System.out.println(raceCar.currentSpeed); // 210
        System.out.println(raceCar.nitro); // 1
        
        raceCar.applyBrakes(); 
        System.out.println(raceCar.currentSpeed); // 180
        System.out.println(raceCar.nitro); // 1
        
        raceCar.accelerate(); 
        System.out.println(raceCar.currentSpeed); // 250
        System.out.println(raceCar.nitro); // 0
        
        raceCar.soundHorn();
    }
}
