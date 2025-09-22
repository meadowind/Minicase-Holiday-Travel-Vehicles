public class TradeInVehicle {
    private String serialNumber;
    private String make;
    private String model;
    private int year;

    public TradeInVehicle(String serialNumber, String make, String model, int year) {
        this.serialNumber = serialNumber;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getters and Setters
    public String getSerialNumber() { return serialNumber; }
    public void setSerialNumber(String serialNumber) { this.serialNumber = serialNumber; }

    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    @Override
    public String toString() {
        return "TradeInVehicle [Serial=" + serialNumber + ", Make=" + make + 
               ", Model=" + model + ", Year=" + year + "]";
    }
}
