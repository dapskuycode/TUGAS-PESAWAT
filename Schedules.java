public class Schedules {
    private String departureTime;
    private String arriveTime;
    private Airports airport;
    private Airports airportDestination;

    // Constructor
    public Schedules(String departureTime, String arriveTime, Airports airport, Airports airportDestination) {
        this.departureTime = departureTime;
        this.arriveTime = arriveTime;
        this.airport = airport;
        this.airportDestination = airportDestination;
    }

    // Getters and Setters
    public String getDepartureTime() { return departureTime; }
    public void setDepartureTime(String departureTime) { this.departureTime = departureTime; }

    public String getArriveTime() { return arriveTime; }
    public void setArriveTime(String arriveTime) { this.arriveTime = arriveTime; }

    public Airports getAirport() { return airport; }
    public void setAirport(Airports airport) { this.airport = airport; }

    public Airports getAirportDestination() { return airportDestination; }
    public void setAirportDestination(Airports airportDestination) { this.airportDestination = airportDestination; }
}
