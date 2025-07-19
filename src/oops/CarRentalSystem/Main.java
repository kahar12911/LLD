package oops.CarRentalSystem;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("1234",2.5);
        double totalRent1 = car1.rentalCalculation(5);
        System.out.println("Total Rent1 :  " + totalRent1);

        Vehicle car2 = new Car("7890",3.0);
        double totalRent2 = car2.rentalCalculation(3.0);
        System.out.println("Total Rent2 :  " + totalRent2);

        //Vehicle vehicle = new Vehicle(,2.0);

       Vehicle bike1 = new Bike("0007",1.5);
       double totalRent3 = bike1.rentalCalculation(4.5);
////        System.out.println("Total Rent :  " + bike1.getVehicleId());
////        System.out.println("Total Rent :  " + bike1.getVehicleId());
       System.out.println("Total Rent3 :  " + totalRent3);










    }
}
