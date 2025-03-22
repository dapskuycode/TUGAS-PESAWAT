import java.util.List;

public class Customers {
    private String nik;
    private String name;
    private String phoneNumber;
    private String email;
    private List<Tickets> listOfTicket;

    // Constructor
    public Customers(String nik, String name, String phoneNumber, String email, List<Tickets> listOfTicket) {
        this.nik = nik;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.listOfTicket = listOfTicket;
    }

    // Getters and Setters
    public String getNik() { return nik; }
    public void setNik(String nik) { this.nik = nik; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<Tickets> getListOfTicket() { return listOfTicket; }
    public void setListOfTicket(List<Tickets> listOfTicket) { this.listOfTicket = listOfTicket; }

    // Method
    public void printInfoCustomers() {
        System.out.println("NIK: " + getNik());
        System.out.println("Name: " + getName());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Email: " + getEmail());
        System.out.println("List of Ticket: ");
        for (Tickets ticket : listOfTicket) {
            ticket.printInfoTickets();
        }
    }
}
