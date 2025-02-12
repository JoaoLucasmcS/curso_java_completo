package ex1_productInStock.Application;

import ex1_productInStock.Entities.Product;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product;
        product = new Product();

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();
        System.out.println();

        System.out.println("Product Data: " + product);
        System.out.println();

        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.AddProducts(quantity);
        System.out.println();
        System.out.println("Update Data: " + product);


        System.out.println("Enter the number of products to be removed from stock: ");
        int quantity2 = sc.nextInt();
        product.RemoveProducts(quantity2);
        System.out.println();
        System.out.println("Update Data: " + product);


        sc.close();
    }
}
