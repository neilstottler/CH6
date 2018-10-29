
public class PROB8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        String c = "Celsius";
        String f = "Fahrenheit";
        System.out.printf("%s%15s | %10s%10s\n", c, f, f, c);
        for (double celsius = 40, fahrenheit = 120.0; celsius >= 31; celsius--, fahrenheit -= 10) {

            System.out.printf("%4.2f%17.2f | %10.2f%10.2f\n", celsius, celsiusToFahrenheit(celsius),
                    fahrenheit, fahrenheitToCelsius(fahrenheit));

        }

    }

    
    public static double celsiusToFahrenheit(double celsius) {

        return (9.0 / 5.0) * celsius + 32.0;

    }

    
    public static double fahrenheitToCelsius(double fahrenheit) {

        return (5.0 / 9) * (fahrenheit - 32.0);
    }

}
