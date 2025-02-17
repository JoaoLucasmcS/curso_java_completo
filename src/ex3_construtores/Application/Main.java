package ex3_construtores.Application;

import ex3_construtores.Entities.Produto;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);




        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Price: ");
        double price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        int quantity = sc.nextInt();
        System.out.println();
        Produto produto = new Produto(name, price, quantity);



        System.out.println("Product Data: " + produto);
        System.out.println();

        System.out.println("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        produto.AddProducts(quantity);
        System.out.println();
        System.out.println("Update Data: " + produto);


        System.out.println("Enter the number of products to be removed from stock: ");
        int quantity2 = sc.nextInt();
        produto.RemoveProducts(quantity2);
        System.out.println();
        System.out.println("Update Data: " + produto);


        sc.close();
    }
}