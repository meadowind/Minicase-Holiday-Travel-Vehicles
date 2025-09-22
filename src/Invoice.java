import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private String invoiceNumber;
    private String date;
    private double negotiatedPrice;
    private double taxes;
    private double licenseFees;

    private Customer customer;
    private Salesperson salesperson;
    private Vehicle vehicle;
    private TradeInVehicle tradeInVehicle;
    private List<Option> options;

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
        this.options = new ArrayList<>();
    }

    // Add option
    public void addOption(Option option) {
        options.add(option);
    }

    // Set trade-in vehicle
    public void setTradeInVehicle(TradeInVehicle tradeInVehicle) {
        this.tradeInVehicle = tradeInVehicle;
    }

    @Override
    public String toString() {
        return "Invoice [No=" + invoiceNumber + ", Date=" + date +
               ", NegotiatedPrice=" + negotiatedPrice +
               ", Taxes=" + taxes + ", LicenseFees=" + licenseFees + "]\n" +
               "Customer: " + customer + "\n" +
               "Salesperson: " + salesperson + "\n" +
               "Vehicle: " + vehicle + "\n" +
               "Trade-In: " + (tradeInVehicle != null ? tradeInVehicle : "None") + "\n" +
               "Options: " + options;
    }
}
