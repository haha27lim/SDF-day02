package models;

public class TurboChargedCar extends Car {

    // property to track whether the turbo is engaged or not
    private Boolean turbo = false;

    // constructor that calls the super class constructor
    public TurboChargedCar(String registration) {
        //First line
        super(registration);
    }

    // getter and setter for the turbo property
    public Boolean getTurbo() { return turbo; }
    public void setTurbo(Boolean turbo) { this.turbo = turbo; }

    // override the accelerate method from the super class
    @Override
    public void accelerate() {
        if (this.turbo) {
            // accelerate 5 times if the turbo is engaged
            super.accelerate();
            super.accelerate();
            super.accelerate();
            super.accelerate();
            super.accelerate();
            System.out.println("Vrooooooommmmmmmmmmmm!");
        } else {
        // accelerate once if the turbo is not engaged
        super.accelerate();
        System.out.println("Pfttt...");
        }

    }

}
