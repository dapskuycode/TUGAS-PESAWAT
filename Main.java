import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Planes> LoP = new ArrayList<>(); 
        // Membuat Airlines
        Airlines airline1 = new Airlines("Garuda Indonesia", "Indonesia", LoP);

        // Membuat Airports
        Airports airport1 = new Airports("Soekarno-Hatta International Airport", "Jakarta", "DKI Jakarta", "Indonesia");
        Airports airport2 = new Airports("Ngurah Rai International Airport", "Denpasar", "Bali", "Indonesia");

        // Membuat Pesawat
        Planes plane1 = new CommercialPlanes("GA123", "Boeing 737", airline1, 10);
        Planes plane2 = new CargoPlanes("GA456", "Airbus A330", airline1,1210, "Paket");

        // Menambahkan pesawat ke list pesawat
        airline1.getListOfPlane().add(plane1);
        airline1.getListOfPlane().add(plane2);

        // Membuat Jadwal Penerbangan.
        // Penggunaan eksepsi : ketika arrive time lebih dulu daripada boarding time, maka akan dilempar ke ScheduleException.
        // ketika masuk ke blok catch, akan menampilkan pesan dari ScheduleException, dan kode program akan dihentikan
        Schedules schedule1 = null;
        try{
            schedule1 = new Schedules("23-03-2025 10:00", "23-03-2025 19:00", airport1, airport2);
        }
        catch(ScheduleExpception e){
            System.out.println("Eror!" + e.getMessage());
            System.exit(1);
        }

        // Membuat Customer
        Customers customer1 = new Customers("1234567890132456", "John Doe", "0812339789", "johndoe@email.com", new ArrayList<>());

        // Membuat Tiket
        Tickets ticket1 = new Tickets("TK12345", customer1, schedule1, plane1, "Economy", "12A");
        
        // Menambahkan tiket ke list customer
        customer1.getListOfTicket().add(ticket1);

        //method print masing masing class
        System.out.println("\n--- Print Info Airlines ---");
        airline1.printInfoAirlines();
        System.out.println("\n---=====================---");
        System.out.println("\n--- Print Info Airports ---");
        airport1.printInfoAirports();
        System.out.println("\n---=====================---");
        airport2.printInfoAirports();
        System.out.println("\n---=====================---");
        System.out.println("\n--- Print Info Schedules ---");
        schedule1.printInfoSchedules();
        System.out.println("\n---=====================---");
        System.out.println("\n--- Print Info Customers ---");
        customer1.printInfoCustomers();
        System.out.println("\n---=====================---");
        System.out.println("\n--- Print Detail Tickets ---");
        ticket1.printDetailTickets();
        System.out.println("\n---=====================---");
        System.out.println("\n--- Print Detail Cargo Plane ---");
        plane2.printInfoPlane();
        System.out.println("\n---=====================---");
        System.out.println("\n--- Print Detail Commercial Plane ---");
        plane1.printInfoPlane();
        System.out.println("\n---=====================---");
        System.out.println("\n--- Print Detail Customers ---");
        customer1.printInfoCustomers();
        System.out.println("\n---=====================---");
    }
}
