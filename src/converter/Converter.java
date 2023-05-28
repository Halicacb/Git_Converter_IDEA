package converter;

public class Converter {
    public static double inchesToMeters(double inches) {
        double meters = inches * 0.0254;
        return meters;
    }

    public static double metersToInches(double meters) {
        double inches = meters * 39.37;
        return inches;
    }

    public static double cableLengthToMeters(double cableLength) {
        double meters = cableLength * 185.2;
        return meters;
    }

    public static double metersToCableLength(double meters) {
        double cableLength = meters / 185.2;
        return cableLength;
    }
}