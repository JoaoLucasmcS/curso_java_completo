package ex2_measuresCircunference.Application;

import ex2_measuresCircunference.Utils.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f", c);
        System.out.println();
        System.out.printf("Volume: %.2f", v);
        System.out.println();
        System.out.printf("PI value: %.2f " , Calculator.PI);

        sc.close();
    }
}