public class Salesperson {
    private String salespersonID;
    private String name;

    public Salesperson(String salespersonID, String name) {
        this.salespersonID = salespersonID;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Salesperson [ID=" + salespersonID + ", Name=" + name + "]";
    }
}
