public class Main {
    public static void main(String[] args) {
        VehicleType[] types = new VehicleType[]{new VehicleType("Bus", 1.2d),
                new VehicleType("Car", 1.0d), new VehicleType("Rink", 1.5d),
                new VehicleType("Tractor", 1.2d)};

        types[3].setCoefficient(1.3d);

        double maxCoef = types[0].getCoefficient();
        double sumCoef = 0.0d;
        double avrCoef;

        for (VehicleType type : types) {
            type.display();

            if (type.getCoefficient() > maxCoef) {
                maxCoef = type.getCoefficient();
            }

            sumCoef += type.getCoefficient();
        }

        avrCoef = sumCoef / types.length;
        System.out.println("Maximum tax coefficient: " + maxCoef);
        System.out.println("Average tax coefficient: " + avrCoef);
    }
}
