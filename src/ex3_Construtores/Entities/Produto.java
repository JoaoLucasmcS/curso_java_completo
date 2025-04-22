package ex3_construtores.Entities;

public class Produto {

    public String name;
    public double price;
    public int quantity;

    public Produto(){

    }

    public Produto(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Produto(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double TotalValueInStock(){

        return quantity * price;
    }

    public void AddProducts(int quantity){

        this.quantity += quantity;

    }

    public void RemoveProducts(int quantity){

        this.quantity -= quantity;
    }

    public String toString(){
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f%n", TotalValueInStock());
    }

}