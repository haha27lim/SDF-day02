package models;

import java.util.Date;

public class Car {

    //Properties = members
    private String colour;
    private String make;
    private String registration;
    private Date registrationDate;
    private Integer acceleration = 0;

    //default constructor
    public Car() {}

    // When you add a constructor, the default constructor disappears
    // constructor with one parameter
    public Car(String registration) {
        this.registration = registration;
    }

    // constructor with two parameters
    public Car(String registration, String colour) {
        this.registration = registration;
        this.colour = colour;
    }

    // constructor with three parameters
    public Car(String registration, String colour, String make) {
        this.registration = registration;
        this.colour = colour;
        this.make = make;
    }

    // Access methods to our members
    // getMemberName, setMemberName
    public String getColour() {
        return this.colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    // make -getter and setter
    public String getMake() {
        return this.make;
    }
    public void setMake(String make) {
        switch (make.toLowerCase()){
            // if (make.equals("honda") || make.equals("toyata") || make.equals("mazda"))
            // only allow certain makes of car
            case "honda":
            case "toyata":             
            case "mazda":
                this.make = make;
                break;

            default:
                // do nothing if the make is not allowed
        }
    }

    public String getRegistration() {
        return registration;
    }
    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }
    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
    public Integer getAcceleration() {
        return this.acceleration;
    }

    // Behaviour -method
    public void horn() {
            System.out.println("horn horn horn");
    }
    public void accelerate() {
        if (this.acceleration < 200)
            this.acceleration++;
    }
    public void accelerate(Integer n) {
        for (Integer i = 0; i < n; i++)
            this.accelerate();
    }
    public void decelerate() {
        if (this.acceleration > 0)
            this.acceleration--;
    }
}
