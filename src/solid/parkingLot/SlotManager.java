package solid.parkingLot;

public class SlotManager {
    private int slotId;
    private int floorNumber;
    SlotStatus status;

    public SlotManager(){}

    public void bookSlot(int slotId , int floorNumber){
        if(this.status == SlotStatus.BOOK){
            System.out.println("Already Booked slot: "+slotId+" on floor "+floorNumber);
        }
        else {
            this.slotId = slotId;
            this.floorNumber = floorNumber;
            this.status = SlotStatus.BOOK;
        }
    }

    public void freeSlot(int slotId , int floorNumber){
        this.status = SlotStatus.AVAILABLE;
    }

}
