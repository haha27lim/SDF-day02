package main;

import java.util.Date;

import models.Car;
import models.TurboChargedCar;

public class Main {
    
    public static void main(String[] args) {

        // create a new Car object
        Car myCar = new Car("SAA1232A");
        // create a new TurboChargedCar object
        Car myOtherCar = new TurboChargedCar("T12345");

        // set the properties of myCar
        myCar.setColour("red");
        myCar.setMake("Honda");
        myCar.setRegistration("S12345A");
        myCar.setRegistrationDate(new Date());

        // honk the horn of myCar
        myCar.horn();
        // print the properties of myCar
        System.out.printf("colour: %s, make: %s, registration: %s\n"
            , myCar.getColour(), myCar.getMake(), myCar.getRegistration());

        // accelerate myCar 3 times
        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();

        // print the acceleration of myCar
        System.out.printf("acceleration: %d\n", myCar.getAcceleration());

        // check if myOtherCar is an instance of TurboChargedCar
        if (myOtherCar instanceof TurboChargedCar) {
            //Cast into a TurboChargedCar type
            // if it is, cast myOtherCar into a TurboChargedCar type
            TurboChargedCar turbo = (TurboChargedCar)myOtherCar;
            // set the turbo property to true
            turbo.setTurbo(true);
        }

    }
}
