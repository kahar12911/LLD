package oops.CarRentalSystem;

public abstract class Vehicle implements Rentable {
    private String vehicleId;
    private double ratePerHour;

    public Vehicle(String vehicleId , double rph){
        this.vehicleId = vehicleId;
        this.ratePerHour = rph;
    }
    public String getVehicleId(){
        System.out.println("Getting Vehicle ID :");
        return this.vehicleId;
    }
    public double getRatePerHour(){
        System.out.println("Getting Rate per hour :");
        return this.ratePerHour;
    }

//    @Override
//    public double rentalCalculation(double hours) {
//        System.out.println("Vehicle Rental Calculation ");
//        return getRatePerHour() * hours;
//    }
}
