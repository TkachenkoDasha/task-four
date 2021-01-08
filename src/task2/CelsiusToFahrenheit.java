package task2;

public class CelsiusToFahrenheit implements Converter {

    public double convert(double degreesCels) {
        return degreesCels * 1.8 + 32;
    }

}
