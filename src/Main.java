public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("V001", "Explorer", "X200", 2025, "Ford", 30000);
        Customer customer = new Customer("C001", "Alice Smith", "123 Main St", "555-1234");
        Salesperson salesperson = new Salesperson("S001", "Bob Johnson");

        Invoice invoice = new Invoice("INV1001", "2025-09-22", 32000, 2000, 500, customer, salesperson, vehicle);
        invoice.setTradeInVehicle(new TradeInVehicle("T001", "Toyota", "Corolla", 2018));
        invoice.addOption(new Option("OPT01", "GPS Navigation", 800));
        invoice.addOption(new Option("OPT02", "Leather Seats", 1200));

        System.out.println(invoice);
    }
}
