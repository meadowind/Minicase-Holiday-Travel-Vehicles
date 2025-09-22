public class Salesperson {
    private String salespersonID;
    private String name;

    public Salesperson(String salespersonID, String name) {
        this.salespersonID = salespersonID;
        this.name = name;
    }

    // Getters and Setters
    public String getSalespersonID() { return salespersonID; }
    public void setSalespersonID(String salespersonID) { this.salespersonID = salespersonID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Salesperson [ID=" + salespersonID + ", Name=" + name + "]";
    }
}
