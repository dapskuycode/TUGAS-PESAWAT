public class Tickets {
    private String bookingCode;
    private Customers customerName;
    private Schedules schedule;
    private Plane plane;
    private String ticketClass;
    private String seatNumber;

    public Tickets(String bookingCode, Customers customerName, Schedules schedule, Plane plane, String ticketClass, String seatNumber) {
        this.bookingCode = bookingCode;
        this.customerName = customerName;
        this.schedule = schedule;
        this.plane = plane;
        this.ticketClass = ticketClass;
        this.seatNumber = seatNumber;
    }

    public String getBookingCode() { return bookingCode; }
    public void setBookingCode(String bookingCode) { this.bookingCode = bookingCode; }

    public Customers getOrderName() { return customerName; }
    public void setOrderName(Customers orderName) { this.customerName = orderName; }  

    public Schedules getSchedule() { return schedule; }
    public void setSchedule(Schedules schedule) { this.schedule = schedule; }

    public Plane getPlane() { return plane; }
    public void setPlane(Plane plane) { this.plane = plane; }

    public String getTicketClass() { return ticketClass; }
    public void setTicketClass(String ticketClass) { this.ticketClass = ticketClass; }

    public String getSeatNumber() { return seatNumber; }
    public void setSeatNumber(String seatNumber) { this.seatNumber = seatNumber; }
}
