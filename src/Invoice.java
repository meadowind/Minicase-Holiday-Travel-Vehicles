public class Invoice {
    private String invoiceNumber;
    private String date;
    private double negotiatedPrice;
    private double taxes;
    private double licenseFees;

    private Customer customer;
    private Salesperson salesperson;
    private Vehicle vehicle;

    public Invoice(String invoiceNumber, String date, double negotiatedPrice, double taxes, double licenseFees,
                   Customer customer, Salesperson salesperson, Vehicle vehicle) {
        this.invoiceNumber = invoiceNumber;
        this.date = date;
        this.negotiatedPrice = negotiatedPrice;
        this.taxes = taxes;
        this.licenseFees = licenseFees;
        this.customer = customer;
        this.salesperson = salesperson;
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Invoice [No=" + invoiceNumber + ", Date=" + date +
               ", NegotiatedPrice=" + negotiatedPrice +
               ", Taxes=" + taxes + ", LicenseFees=" + licenseFees + "]\n" +
               "Customer: " + customer + "\n" +
               "Salesperson: " + salesperson + "\n" +
               "Vehicle: " + vehicle;
    }
}
