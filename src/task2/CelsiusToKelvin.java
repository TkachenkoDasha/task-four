package task2;

public class CelsiusToKelvin implements Converter {

    public double convert(double degreesCels) {
        return (degreesCels + 273.15);
    }

}
