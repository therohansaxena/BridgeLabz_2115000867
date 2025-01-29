import java.util.Scanner;

public class WindChillCalculator {

    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature (in °F): ");
        double temperature = sc.nextDouble();

        System.out.print("Enter the wind speed (in mph): ");
        double windSpeed = sc.nextDouble();

        if (temperature <= 50 && windSpeed >= 3) {
            double windChill = calculateWindChill(temperature, windSpeed);
            System.out.printf("The wind chill temperature is %.2f °F.\n", windChill);
        } else {
            System.out.println("Wind chill calculation is valid only for temperatures ≤ 50°F and wind speeds ≥ 3 mph.");
        }
    }
}
