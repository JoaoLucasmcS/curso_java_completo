package q1_rectangle.Application;

import q1_rectangle.Entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rec  = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rec.width = sc.nextDouble();
        rec.height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", rec.Area());
        System.out.printf("PERIMETER = %.2f%n", rec.Perimeter());
        System.out.printf("DIAGONAL = %.2f", rec.Diagonal());

    }



}
