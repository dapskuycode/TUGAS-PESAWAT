public class Tickets {
    private Schedules schedule;
    private Airlines airline;
    private String seatNumber;
    private String ticketClass;

    // Constructor
    public Tickets(Schedules schedule, Airlines airline, String seatNumber, String ticketClass) {
        this.schedule = schedule;
        this.airline = airline;
        this.seatNumber = seatNumber;
        this.ticketClass = ticketClass;
    }

    // Getters and Setters

    public Schedules getSchedule() { return schedule; }
    public void setSchedule(Schedules schedule) { this.schedule = schedule; }

    public Airlines getAirline() { return airline; }
    public void setAirline(Airlines airline) { this.airline = airline; }

    public String getSeatNumber() { return seatNumber; }
    public void setSeatNumber(String seatNumber) { this.seatNumber = seatNumber; }

    public String getTicketClass() { return ticketClass; }
    public void setTicketClass(String ticketClass) { this.ticketClass = ticketClass; }
}
