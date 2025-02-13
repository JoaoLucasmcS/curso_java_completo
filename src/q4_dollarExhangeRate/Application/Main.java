package q4_dollarExhangeRate.Application;



import q4_dollarExhangeRate.Utils.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double pDolar = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double vDolar = sc.nextDouble();

        double valorR = CurrencyConverter.valorTotalReais(pDolar, vDolar);
        double valorTotal = valorR + (valorR * CurrencyConverter.IOF);

        System.out.printf("Amount to be paid in reais = %.2f", valorTotal);


        sc.close();
    }
}