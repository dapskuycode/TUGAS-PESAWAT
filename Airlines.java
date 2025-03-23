import java.util.List;

public class Airlines {
    private String airlineName;
    private String country;
    private List<Planes> listOfPlane;

    // Constructor
    public Airlines( String airlineName, String country, List<Planes> listOfPlane) {
        this.airlineName = airlineName;
        this.country = country;
        this.listOfPlane = listOfPlane;
    }

    // Getters and Setters
    public String getAirlineName() { return airlineName; }
    public void setAirlineName(String airlineName) { this.airlineName = airlineName; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
}
