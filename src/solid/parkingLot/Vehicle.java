package solid.parkingLot;


public abstract class Vehicle implements VehicleService{
    private String vehicleId;
    private VehicleType type;

    public Vehicle(){

    }

    public Vehicle(String vehicleId, VehicleType type){
        this.vehicleId = vehicleId;
        this.type = type;
    }

    public String getVehicleId(){
        return this.vehicleId;
    }

    public VehicleType getType(){
        return this.type;
    }

}
