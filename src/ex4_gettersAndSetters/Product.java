package ex4_gettersAndSetters;

public class Product {

    public Product(){
    }

    public Product(String name, double price, int quant){
        this.name = name;
        this.price = price;
        this.quant = quant;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    String name;
    double price;
    int quant;

    public double totalNoEstoque(){

        return price * quant;
    }

    public void addProdutos(int quant){

        this.quant += quant;

    }

    public void removeProdutos(int quant){

        this.quant -= quant;

    }

    public String toString(){

        return name + ", $ " + String.format("%.2f", price) + ", " + quant + " unidades, Total em Reais:  $" + String.format("%.2f%n", totalNoEstoque());

    }
}
