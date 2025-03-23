public class ScheduleExpception extends Exception {
    public ScheduleExpception(){
        super("Waktu keberangkatan harus sebelum waktu kedatangan!");
    }    
}
