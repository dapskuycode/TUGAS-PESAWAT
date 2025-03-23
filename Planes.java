
public abstract class Planes {
    protected String idPlane;
    protected String modelPlane;
    protected Airlines airline;

    // Constructor
    public Planes(String idPlane, String modelPlane, Airlines airline) {
        this.idPlane = idPlane;
        this.modelPlane = modelPlane;
        this.airline = airline;
    }

    // Getters and Setters
    protected String getIdPlane() { return idPlane; }
    public void setIdPlane(String idPlane) { this.idPlane = idPlane; }

    protected String getModelPlane() { return modelPlane; }
    public void setModelPlane(String modelPlane) { this.modelPlane = modelPlane; }

    protected Airlines getAirline() { return airline; }
    public void setAirline(Airlines airline) { this.airline = airline; }

    // Abstract Method
    public abstract void printInfoPlane();
}
