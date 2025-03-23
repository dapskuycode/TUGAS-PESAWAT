import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Schedules {
    private LocalDateTime boardingTime;
    private LocalDateTime arriveTime;
    private Airports airport;
    private Airports airportDestination;

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    // Constructor
    public Schedules(String boardingTime, String arriveTime, Airports airport, Airports airportDestination) {
        this.boardingTime = LocalDateTime.parse(boardingTime, formatter);
        this.arriveTime = LocalDateTime.parse(arriveTime, formatter);
        this.airport = airport;
        this.airportDestination = airportDestination;

        // Asersi: Waktu keberangkatan harus sebelum waktu kedatangan
        assert this.boardingTime.isBefore(this.arriveTime) : "Waktu keberangkatan harus sebelum waktu kedatangan!";
    }

    // Getters dan Setters
    public LocalDateTime getBoardingTime() { 
        return boardingTime; 
    }
    public void setBoardingTime(String boardingTime) { 
        this.boardingTime = LocalDateTime.parse(boardingTime, formatter);
        assert this.boardingTime.isBefore(this.arriveTime) : "Waktu keberangkatan harus sebelum waktu kedatangan!";
    }

    public LocalDateTime getArriveTime() { return arriveTime; }
    public void setArriveTime(String arriveTime) { 
        this.arriveTime = LocalDateTime.parse(arriveTime, formatter);
        assert this.boardingTime.isBefore(this.arriveTime) : "Waktu keberangkatan harus sebelum waktu kedatangan!";
    }

    public Airports getAirport() { 
        return airport; 
    }
    public void setAirport(Airports airport) { 
        this.airport = airport; 
    }

    public Airports getAirportDestination() { 
        return airportDestination; 
    }
    public void setAirportDestination(Airports airportDestination) { 
        this.airportDestination = airportDestination; 
    }

    // Method
    public void printInfoSchedules() {
        System.out.println("Boarding Time: " + boardingTime.format(formatter));
        System.out.println("Arrive Time: " + arriveTime.format(formatter));
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
