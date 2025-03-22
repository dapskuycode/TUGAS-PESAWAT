public class Schedules {
    private String boardingTime;
    private String arriveTime;
    private Airports airport;
    private Airports airportDestination;

    // Constructor
    public Schedules(String boardingTime, String arriveTime, Airports airport, Airports airportDestination) {
        this.boardingTime = boardingTime;
        this.arriveTime = arriveTime;
        this.airport = airport;
        this.airportDestination = airportDestination;
    }

    // Getters and Setters
    public String getboardingTime() { return boardingTime; }
    public void setboardingTime(String boardingTime) { this.boardingTime = boardingTime; }

    public String getArriveTime() { return arriveTime; }
    public void setArriveTime(String arriveTime) { this.arriveTime = arriveTime; }

    public Airports getAirport() { return airport; }
    public void setAirport(Airports airport) { this.airport = airport; }

    public Airports getAirportDestination() { return airportDestination; }
    public void setAirportDestination(Airports airportDestination) { this.airportDestination = airportDestination; }

    // Method
    public void printInfoSchedules() {
        System.out.println("Boarding Time: " + getboardingTime());
        System.out.println("Arrive Time: " + getArriveTime());
        System.out.println("Airport: " + airport.getAirport());
        System.out.println("City: " + airport.getCity());
        System.out.println("Province: " + airport.getProvince());
        System.out.println("Country: " + airport.getCountry());
        System.out.println("Airport Destination: " + airportDestination.getAirport());
        System.out.println("City Destination: " + airportDestination.getCity());
        System.out.println("Province Destination: " + airportDestination.getProvince());
        System.out.println("Country Destination: " + airportDestination.getCountry());
    }
}
