package q4_dollarExhangeRate.Utils;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double valorTotalReais(double precoDolar, double valorDolar) {

        double valorReal = valorDolar * precoDolar;
        return valorReal;
    }
}
