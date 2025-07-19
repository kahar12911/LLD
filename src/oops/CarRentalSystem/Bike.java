package oops.CarRentalSystem;

public class Bike extends Vehicle implements Rentable{

    public Bike(String number , double rph){
        //System.out.println("Bike Constructor :");
        super(number,rph);

    }


    @Override
    public double rentalCalculation(double hours) {
        System.out.println("Bike Rental Calculation :");
        return getRatePerHour() * hours;
    }
}
