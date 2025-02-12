package q2_employee.Application;

import q2_employee.Entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee fulaninho = new Employee();

        System.out.println("Name: ");
        fulaninho.name = sc.nextLine();
        System.out.println("Gross salary: ");
        fulaninho.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        fulaninho.tax = sc.nextDouble();
        System.out.println();

        System.out.println("Employee: " + fulaninho);
        System.out.println();

        System.out.println("Which percentage to increase salary? ");
        double inc = sc.nextDouble();
        fulaninho.IncrementoNoSalario(inc);
        System.out.println();

        System.out.println("Update data: " + fulaninho);

        sc.close();
    }

}
