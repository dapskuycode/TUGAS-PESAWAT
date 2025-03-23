public class CommercialPlanes extends Planes {
    private int passengerCapacity;  // Kapasitas maksimum penumpang

    // Constructor
    public CommercialPlanes(String idPlane, String modelPlane, Airlines airline, int passengerCapacity) {
        super(idPlane, modelPlane, airline);
        
        // Asersi: kapasitas penumpang harus lebih dari 0
        assert passengerCapacity > 0 : "Kapasitas penumpang harus lebih dari 0!";

        this.passengerCapacity = passengerCapacity;
    }

    // Getters and Setters
    public int getPassengerCapacity() {
        return passengerCapacity; 
    }
    
    public void setPassengerCapacity(int passengerCapacity) { 
        assert passengerCapacity > 0 : "Kapasitas penumpang harus lebih dari 0!"; // Asersi di setter
        this.passengerCapacity = passengerCapacity; 
    }

    // Implementasi abstract method
    public void printInfoPlane() {
        System.out.println("ID Plane: " + getIdPlane());
        System.out.println("Model Plane: " + getModelPlane());
        System.out.println("Airline: " + getAirline().getAirlineName());
        System.out.println("Passenger Capacity: " + getPassengerCapacity() + " passengers");
    }
}
