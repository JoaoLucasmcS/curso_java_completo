package ex3_Construtores.Application;

import ex1_productInStock.Entities.Product;
import ex3_Construtores.Entities.Produto;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String nome = sc.nextLine();
        System.out.println("Price: ");
        double preco = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        int quantidade = sc.nextInt();
        Produto produto =  new Produto(nome, preco, quantidade);


        System.out.println();
        System.out.println("Product Data: " + produto);
        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        quantidade = sc.nextInt();
        produto.AddProducts(quantidade);
        System.out.println();
        System.out.println("Update Data: " + produto);


        System.out.println("Enter the number of products to be removed from stock: ");
        quantidade = sc.nextInt();
        produto.RemoveProducts(quantidade);
        System.out.println();
        System.out.println("Update Data: " + produto);


        sc.close();
    }
}