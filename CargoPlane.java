public class CargoPlane extends Plane {
    private int cargoCapacity;  // Kapasitas kargo dalam kg
    private String cargoType;   // Jenis kargo yang diangkut (misal: paket, bahan bakar, barang berbahaya)

    // Constructor
    public CargoPlane(String idPlane, String modelPlane, Airlines airline, int cargoCapacity, String cargoType) {
        super(idPlane, modelPlane, airline);
        this.cargoCapacity = cargoCapacity;
        this.cargoType = cargoType;
    }

    // Getters and Setters
    public int getCargoCapacity() { return cargoCapacity; }
    public void setCargoCapacity(int cargoCapacity) { this.cargoCapacity = cargoCapacity; }

    public String getCargoType() { return cargoType; }
    public void setCargoType(String cargoType) { this.cargoType = cargoType; }
}
