import java.time.format.DateTimeFormatter;

public class Tickets {
    private String bookingCode;
    private Customers customerName;
    private Schedules schedule;
    private Planes plane;
    private String ticketClass;
    private String seatNumber;
    private static int counterTicket = 0;

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    public Tickets(String bookingCode, Customers customerName, Schedules schedule, Planes plane, String ticketClass, String seatNumber) {
        this.bookingCode = bookingCode;
        this.customerName = customerName;
        this.schedule = schedule;
        this.plane = plane;
        this.ticketClass = ticketClass;
        this.seatNumber = seatNumber;
        counterTicket ++;
    }

    public String getBookingCode() { 
        return bookingCode; 
    }
    public void setBookingCode(String bookingCode) { 
        this.bookingCode = bookingCode; 
    }

    public Customers getOrderName() { 
        return customerName; 
    }
    public void setOrderName(Customers orderName) { 
        this.customerName = orderName; 
    }  

    public Schedules getSchedule() { 
        return schedule; 
    }
    public void setSchedule(Schedules schedule) { 
        this.schedule = schedule; 
    }

    public Planes getPlane() { 
        return plane; 
    }
    public void setPlane(Planes plane) { 
        this.plane = plane; 
    }

    public String getTicketClass() { 
        return ticketClass; 
    }
    public void setTicketClass(String ticketClass) { 
        this.ticketClass = ticketClass; 
    }

    public String getSeatNumber() { 
        return seatNumber; 
    }
    public void setSeatNumber(String seatNumber) { 
        this.seatNumber = seatNumber; 
    }

    public static void PrintCounterTicket(){

        System.out.println("Jumlah tiket : " + counterTicket);
    }

    public void printDetailTickets(){
        System.out.println("Booking Code: " + getBookingCode());
        System.out.println("Customer Name: " + customerName.getName());
        System.out.println("Schedule: " + schedule.getBoardingTime().format(formatter) + " - " + schedule.getArriveTime().format(formatter));
        System.out.println("Airport: " + schedule.getAirport().getAirport());
        System.out.println("Airport Destination: " + schedule.getAirportDestination().getAirport());
        System.out.println("Plane: " + plane.getIdPlane());
        System.out.println("Model Plane: " + plane.getModelPlane());
        System.out.println("Airline: " + plane.getAirline().getAirlineName());
        System.out.println("Ticket Class: " + getTicketClass());
        System.out.println("Seat Number: " + getSeatNumber());
    }
}
