public class ScheduleCollissionExpception extends Exception {
    public ScheduleCollissionExpception(){
        super("Jadwal bertabrakan!!!\nSilahkan pilih jadwal yang lain.");
    }    
}
