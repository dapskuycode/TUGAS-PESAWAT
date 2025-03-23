import java.util.List;
import java.time.format.DateTimeFormatter;

public class Customers {
    private String nik;
    private String name;
    private String phoneNumber;
    private String email;
    private List<Tickets> listOfTicket;

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    // Constructor
    public Customers(String nik, String name, String phoneNumber, String email, List<Tickets> listOfTicket) {
        assert nik.length() >= 16 : "NIK harus memiliki minimal 16 digit!";
        assert phoneNumber.length() <= 15 && phoneNumber.length() >= 10: "Nomor telepon harus memiliki minimal 10 dan maksimal 15 digit!";

        this.nik = nik;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.listOfTicket = listOfTicket;
    }

    // Getters and Setters
    public String getNik() { 
        return nik; 
    }
    
    public void setNik(String nik) { 
        assert nik.length() >= 16 : "NIK harus memiliki minimal 16 digit!"; // Asersi di setter
        this.nik = nik; 
    }

    public String getName() { 
        return name; 
    }
    
    public void setName(String name) { 
        this.name = name; 
    }

    public String getPhoneNumber() { 
        assert phoneNumber.length() <= 15 && phoneNumber.length() >= 10: "Nomor telepon harus memiliki minimal 10 dan maksimal 15 digit!";
        return phoneNumber; 
    }
    
    public void setPhoneNumber(String phoneNumber) { 
        this.phoneNumber = phoneNumber; 
    }

    public String getEmail() { 
        return email; 
    }
    
    public void setEmail(String email) { 
        this.email = email; 
    }

    public List<Tickets> getListOfTicket() { 
        return listOfTicket; 
    }
    
    public void setListOfTicket(List<Tickets> listOfTicket) { 
        this.listOfTicket = listOfTicket; 
    }

    // Method
    public void printInfoCustomers() {
        System.out.println("NIK: " + getNik());
        System.out.println("Name: " + getName());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Email: " + getEmail());
        System.out.println("List of Ticket: ");
        for (Tickets T : listOfTicket) {
            System.out.println("- " + T.getBookingCode() + ", " 
            + T.getSchedule().getBoardingTime().format(formatter) + ", "
            + T.getSchedule().getAirport().getAirport() + ", "
            + T.getPlane().getIdPlane() + ", "
            + T.getPlane().getAirline().getAirlineName() + ", "
            + T.getTicketClass() + ", "
            + T.getSeatNumber());
        }
    }
}
