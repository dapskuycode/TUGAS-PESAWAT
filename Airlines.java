public class Airlines {
    private String airlineName;
    private String country;

    // Constructor
    public Airlines( String airlineName, String country) {
        this.airlineName = airlineName;
        this.country = country;
    }

    // Getters and Setters
    public String getAirlineName() { return airlineName; }
    public void setAirlineName(String airlineName) { this.airlineName = airlineName; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    // Method
    public void printInfoAirlines() {
        System.out.println("Airline: " + getAirlineName());
        System.out.println("Country: " + getCountry());
    }
}
