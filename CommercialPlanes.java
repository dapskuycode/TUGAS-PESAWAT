public class CommercialPlanes extends Planes {
    private int passengerCapacity;  // Kapasitas maksimum penumpang

    // Constructor
    public CommercialPlanes(String idPlane, String modelPlane, Airlines airline, int passengerCapacity) {
        super(idPlane, modelPlane, airline);
        this.passengerCapacity = passengerCapacity;
    }

    // Getters and Setters
    public int getPassengerCapacity() { return passengerCapacity; }
    public void setPassengerCapacity(int passengerCapacity) { this.passengerCapacity = passengerCapacity; }
}
