package ex5_productInStockEncapsulamento;

public class Produto {

    private String name;
    private double price;
    private int quantity;

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

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
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