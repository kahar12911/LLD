package solid.parkingLot;

public class TicketService {

    public void generateTicket(String vehicleId){
        System.out.println("Generating Ticket for the " + vehicleId);

    }

    public void closeTicket(String vehicleId){
        System.out.println("Closing Ticket for the "+vehicleId);
    }
}
