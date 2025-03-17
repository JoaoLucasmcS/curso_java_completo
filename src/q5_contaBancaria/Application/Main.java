package q5_contaBancaria.Application;

import q5_contaBancaria.Entities.ContaBancaria;

import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o número da conta: ");
        int numeroDaConta = sc.nextInt();

        System.out.println("Insira o nome do cliente: ");
        String nomeDoCliente = sc.nextLine();

        System.out.println("Deseja fazer um depósito inicial? ");
        String resposta = sc.nextLine();

        if(Objects.equals(resposta, "Sim") || Objects.equals(resposta, "sim")){
            ContaBancaria cb1 = new ContaBancaria(numeroDaConta, nomeDoCliente);
        } else{
            ContaBancaria cb1 = new ContaBancaria(numeroDaConta, nomeDoCliente);
        }




        sc.close();
    }



}
