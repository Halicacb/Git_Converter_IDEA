package converter;

public class Main {
    public static void main(String[] args) {
        double inches = 10.0;
        double meters = 5.0;

        double convertedMeters = Converter.inchesToMeters(inches);
        System.out.println(inches + " дюймів = " + convertedMeters + " метрів");

        double convertedInches = Converter.metersToInches(meters);
        System.out.println(meters + " метрів = " + convertedInches + " дюймів");
    }
}
