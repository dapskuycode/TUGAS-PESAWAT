public class Airports {
    private String airport;
    private String city;
    private String province;

    // Constructor
    public Airports(String airport, String city, String province) {
        this.airport = airport;
        this.city = city;
        this.province = province;
    }

    // Getters and Setters
    public String getAirport() { return airport; }
    public void setAirport(String airport) { this.airport = airport; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getProvince() { return province; }
    public void setProvince(String province) { this.province = province; }
}
