package task2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Converter> converters = Arrays.asList(new CelsiusToKelvin(), new CelsiusToFahrenheit());

        for (Converter converter : converters) {
            System.out.println(converter.convert(41));
        }

    }
}
