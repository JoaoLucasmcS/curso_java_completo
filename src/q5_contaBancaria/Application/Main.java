package q5_contaBancaria.Application;

import q5_contaBancaria.Entities.ContaBancaria;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        ContaBancaria cb1;

        System.out.println("Insira o número da conta: ");
        int numeroDaConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Insira o nome do cliente: ");
        String nomeDoCliente = sc.nextLine();

        System.out.println("Deseja fazer um depósito inicial? (S/N)");
        String resposta = sc.nextLine();

        if(Objects.equals(resposta, "S") || Objects.equals(resposta, "s")){
            System.out.println("Insira o valor que você deseja depositar: ");
            double valorInicialDeposito = sc.nextDouble();
            cb1 = new ContaBancaria(numeroDaConta, nomeDoCliente , valorInicialDeposito);
        } else{
             cb1 = new ContaBancaria(numeroDaConta, nomeDoCliente);
        }

        System.out.println(cb1);

        System.out.println("Insira o valor do depósito: ");
        double valorASerDepositado = sc.nextDouble();
        cb1.depositar(valorASerDepositado);

        System.out.println(cb1);

        System.out.println("Quanto você deseja sacar? ");
        double valorDoSaque = sc.nextDouble();
        cb1.sacar(valorDoSaque);

        System.out.println(cb1);

        sc.close();
    }



}
