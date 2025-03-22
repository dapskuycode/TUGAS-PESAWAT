public class CommercialPlane extends Plane {
    private int passengerCapacity;  // Kapasitas maksimum penumpang

    // Constructor
    public CommercialPlane(String idPlane, String modelPlane, Airlines airline, int passengerCapacity) {
        super(idPlane, modelPlane, airline);
        this.passengerCapacity = passengerCapacity;
    }

    // Getters and Setters
    public int getPassengerCapacity() { return passengerCapacity; }
    public void setPassengerCapacity(int passengerCapacity) { this.passengerCapacity = passengerCapacity; }

    // Implementasi abstract method
    public void printInfoPlane() {
        System.out.println("ID Plane: " + getIdPlane());
        System.out.println("Model Plane: " + getModelPlane());
        System.out.println("Airline: " + getAirline().getAirlineName());
        System.out.println("Passenger Capacity: " + getPassengerCapacity() + " passengers");
    }
}
