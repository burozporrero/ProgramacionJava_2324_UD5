package teoria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CelsiusToFarenheit{
        public static void main(String[] args) {
            celsiusToFarenheitError();
            //celsiusToFarenheit();
        }

        public static void celsiusToFarenheitError(){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter value in Celsius to convert in fahrenheit:");

            double Celsius = scanner.nextFloat();
            double fahrenheit = (Celsius * 1.8)+32;

            System.out.printf("%.1f degrees Celsuis is %.1f degrees in Fahrenheit ",Celsius,fahrenheit);
            scanner.close();
        }

    public static void celsiusToFarenheit(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value in Celsius to convert in fahrenheit:");

        try {

            double Celsius = scanner.nextFloat();
            double fahrenheit = (Celsius * 1.8) + 32;

            System.out.printf("%.1f degrees Celsuis is %.1f degrees in Fahrenheit ", Celsius, fahrenheit);
        } catch (InputMismatchException e) {
            System.out.println("Wrong input type entered...exiting the program");
        }
        scanner.close();
    }
}
