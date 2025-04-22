package ex4_gettersAndSetters;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira as Informações do Produto: %n");

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Preço: " );
        double preco = sc.nextDouble();



        Product produtoUm = new Product(nome, preco);

        System.out.println(produtoUm);


        System.out.println("Quantos desse produto você deseja adicionar no estoque? ");
        int quantidade = sc.nextInt();
        produtoUm.addProdutos(quantidade);


        System.out.printf("%nDados atualizados: " + produtoUm);
        System.out.println();

        System.out.println("Quantos desse produto você deseja remover do estoque? ");
        int quantidade1 = sc.nextInt();
        produtoUm.removeProdutos(quantidade1);


        System.out.println("Dados atualizados:" + produtoUm);
        System.out.println();


        sc.close();

    }



}
