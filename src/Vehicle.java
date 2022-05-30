public class Vehicle implements Comparable<Vehicle> {
    private VehicleType vehicleType;
    private String modelName;
    private String registrationNumber;
    private int weight;
    private int manufactureYear;
    private int mileage;
    private Color color;
    private int volume;

    public Vehicle() {}

    public Vehicle(VehicleType vehicleType, String modelName, String registrationNumber,
                   int weight, int manufactureYear, int mileage, Color color) {
        this.vehicleType = vehicleType;
        this.modelName = modelName;
        this.manufactureYear = manufactureYear;
        this.registrationNumber = registrationNumber;
        this.weight = weight;
        this.mileage = mileage;
        this.color = color;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public String getModelName() {
        return this.modelName;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getManufactureYear() {
        return this.manufactureYear;
    }

    public int getMileage() {
        return this.mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getCalcTaxPerMonth() {
        return (weight * 0.0013d) + (vehicleType.getCoefficient() * 30.0d) + 5.0d;
    }

    public String toString() {
        return this.vehicleType.getString() + ", " + this.modelName + ", " + this.registrationNumber + ", "
                + this.weight + ", " + this.manufactureYear + ", " + this.mileage + ", " + this.color + ", "
                + this.volume + ", , \"" + this.getCalcTaxPerMonth() + "\"";
    }

    public boolean equals(Object o) {
        if (!(o instanceof Vehicle)) {
            return false;
        } else {
            Vehicle secondVehicle = (Vehicle)o;
            return this.modelName.equals(secondVehicle.getModelName()) && this.vehicleType.equals(secondVehicle.getVehicleType());
        }
    }

    public int hashCode() {
        return this.modelName.hashCode();
    }

    public int compareTo(Vehicle obj) {
        return manufactureYear != obj.getManufactureYear() ?
                Integer.compare(manufactureYear, obj.getManufactureYear()) :
                Integer.compare(mileage, obj.getMileage());
    }
}
