import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas? ");
        int N = sc.nextInt();

        double[] alturas = new double[N];
        double soma = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Altura da pessoa " + (i+1) + ": ");
            alturas[i] = sc.nextDouble();
            soma += alturas[i];
        }

        double media = soma / N;
        System.out.println("Média das alturas: " + media);

        sc.close();
    }
}