public class SeatNumberIsBookedException extends Exception {
    public SeatNumberIsBookedException(){
        super("Nomor Kursi sudah di Booking!!!\nSilahkan pilih kursi yang lain.");
    }
}
