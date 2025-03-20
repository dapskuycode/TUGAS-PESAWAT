public class Airlines {
    private String airlineId;
    private String airlineName;
    private String country;

    // Constructor
    public Airlines(String airlineId, String airlineName, String country) {
        this.airlineId = airlineId;
        this.airlineName = airlineName;
        this.country = country;
    }

    // Getters and Setters
    public String getAirlineId() { return airlineId; }
    public void setAirlineId(String airlineId) { this.airlineId = airlineId; }

    public String getAirlineName() { return airlineName; }
    public void setAirlineName(String airlineName) { this.airlineName = airlineName; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
}
