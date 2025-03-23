public class Airports {
    private String airport;
    private String city;
    private String province;
    private String country;

    // Constructor
    public Airports(String airport, String city, String province, String country) {
        this.airport = airport;
        this.city = city;
        this.province = province;
        this.country = country;
    }

    // Getters and Setters
    public String getAirport() { 
        return airport; 
    }
    public void setAirport(String airport) {
        this.airport = airport; 
    }

    public String getCity() {
        return city; 
    }
    public void setCity(String city) {
        this.city = city; 
    }

    public String getProvince() {
        return province; 
    }
    public void setProvince(String province) {
        this.province = province; 
    }

    public String getCountry() {
        return country; 
    }
    public void setCountry(String country) {
        this.country = country; 
    }

    // Method
    public void printInfoAirports() {
        System.out.println("Airport: " + getAirport());
        System.out.println("City: " + getCity());
        System.out.println("Province: " + getProvince());
        System.out.println("Country: " + getCountry());
    }
}
