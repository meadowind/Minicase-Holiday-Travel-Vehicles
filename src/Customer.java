public class Customer {
    private String customerID;
    private String name;
    private String address;
    private String phone;

    public Customer(String customerID, String name, String address, String phone) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer [ID=" + customerID + ", Name=" + name +
               ", Address=" + address + ", Phone=" + phone + "]";
    }
}
