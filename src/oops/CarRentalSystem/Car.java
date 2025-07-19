package oops.CarRentalSystem;

public class Car extends Vehicle{

    public Car(String number, double rph) {
        super(number,rph);
    }

    @Override
    public double rentalCalculation(double hours) {
        System.out.println("Car Rental Calculation :");
        System.out.println("RPH " + getRatePerHour() +" hours:  "+hours);
        return getRatePerHour() * hours;
    }
}
