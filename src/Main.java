public class Main {
    public static void main(String[] args) {
        VehicleType[] types = new VehicleType[]{new VehicleType("Bus", 1.2d),
                new VehicleType("Car", 1.0d), new VehicleType("Rink", 1.5d),
                new VehicleType("Tractor", 1.2d)};

        Vehicle[] vehicles = new Vehicle[]{
                new Vehicle(types[0], "Volkswagen Crafter", "5427 AX-7", 2022,
                        2015, 376000, Color.Blue),
                new Vehicle(types[0], "Volkswagen Crafter", "6427 AA-7", 2500,
                        2014, 227010, Color.White),
                new Vehicle(types[0], "Electric Bus E321", "6785 BA-7", 12080,
                        2019, 20451, Color.Green),
                new Vehicle(types[1], "Golf 5", "8682 AX-7", 1200,
                        2006, 230451, Color.Gray),
                new Vehicle(types[1], "Tesla Model S 70D", "0001 AA-7", 2200,
                        2019, 10454, Color.White),
                new Vehicle(types[2], "Hamm HD 12VV", null,
                        3000, 2016, 122, Color.Yellow),
                new Vehicle(types[3], "МТЗ Беларус-1025.4", "1145 AB-7", 1200,
                        2020, 109, Color.Red)
        };
        Vehicle copy;
        Vehicle maxMileage = vehicles[0];
        Vehicle minMileage = vehicles[0];

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
        System.out.println();

        for (int i = 0; i < vehicles.length; i++) {
            for (int j = 0; j < vehicles.length - 1; j++) {
                if (vehicles[j].compareTo(vehicles[j + 1]) > 0) {
                    copy = vehicles[j + 1];
                    vehicles[j + 1] = vehicles[j];
                    vehicles[j] = copy;
                }
            }
        }

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }

        System.out.println();
        System.out.println("Car with max mileage: " + maxMileage);
        System.out.println("Car with min mileage: " + minMileage);
    }
}
