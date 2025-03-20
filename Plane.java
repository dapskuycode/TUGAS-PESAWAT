public class Plane {
    private String idPlane;
    private String modelPlane;
    private Airlines airline;

    // Constructor
    public Plane(String idPlane, String modelPlane, Airlines airline) {
        this.idPlane = idPlane;
        this.modelPlane = modelPlane;
        this.airline = airline;
    }

    // Getters and Setters
    public String getIdPlane() { return idPlane; }
    public void setIdPlane(String idPlane) { this.idPlane = idPlane; }

    public String getModelPlane() { return modelPlane; }
    public void setModelPlane(String modelPlane) { this.modelPlane = modelPlane; }

    public Airlines getAirline() { return airline; }
    public void setAirline(Airlines airline) { this.airline = airline; }
}
