package converter;

public class Main {
    public static void main(String[] args) {
        double inches = 100.0;
        double meters = 500.0;
        double cableLength = 2.0;

        double convertedMeters = Converter.inchesToMeters(inches);
        System.out.println(inches + " дюймів = " + convertedMeters + " метрів");

        double convertedInches = Converter.metersToInches(meters);
        System.out.println(meters + " метрів = " + convertedInches + " дюймів");

        double convertedCableLengthToMeters = Converter.cableLengthToMeters(cableLength);
        System.out.println(cableLength + " кабельт = " + convertedCableLengthToMeters + " метрів");

        double convertedMetersToCableLength = Converter.metersToCableLength(meters);
        System.out.println(meters + " метрів = " + convertedMetersToCableLength + " кабельт");
    }
}
