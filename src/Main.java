public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("V001", "Explorer", "X200", 2025, "Ford", 30000);
        Customer customer = new Customer("C001", "Alice Smith", "123 Main St", "555-1234");
        Salesperson salesperson = new Salesperson("S001", "Bob Johnson");

        Invoice invoice = new Invoice("INV1001", "2025-09-22", 32000, 2000, 500,
                                      customer, salesperson, vehicle);

        System.out.println(invoice);
    }
}
