public class Payments {
    private String idPayment;
    private float amount;
    private String datePayment;
    private String paymentMethod;
    private String status;

    // Constructor
    public Payments(String idPayment, float amount, String datePayment, String paymentMethod, String status) {
        this.idPayment = idPayment;
        this.amount = amount;
        this.datePayment = datePayment;
        this.paymentMethod = paymentMethod;
        this.status = status;
    }

    // Getters and Setters
    public String getIdPayment() { return idPayment; }
    public void setIdPayment(String idPayment) { this.idPayment = idPayment; }

    public float getAmount() { return amount; }
    public void setAmount(float amount) { this.amount = amount; }

    public String getDatePayment() { return datePayment; }
    public void setDatePayment(String datePayment) { this.datePayment = datePayment; }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
