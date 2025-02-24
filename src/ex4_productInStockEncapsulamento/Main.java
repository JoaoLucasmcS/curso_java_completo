package ex4_productInStockEncapsulamento;

import ex4_productInStockEncapsulamento.Produto;

import javax.xml.transform.stream.StreamSource;
import java.net.StandardSocketOptions;
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

        System.out.println("Quantity: ");
        int quantity = sc.nextInt();

        System.out.println();

        Produto produto = new Produto(name, price, quantity);

        produto.setName("Compute");
        System.out.println("Update Name: " + produto.getName());

        produto.setPrice(5.000);
        System.out.println("Update Price: " + produto.getPrice());



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
