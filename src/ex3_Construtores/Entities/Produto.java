package ex3_Construtores.Entities;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public double TotalValueInStock(){

        return quantidade * preco;
    }

    public void AddProducts(int quantidade){
        this.quantidade += quantidade;
    }

    public void RemoveProducts(int preco){
                this.quantidade -= quantidade;
    }

    public String toString(){
        return nome + ", $ " + String.format("%.2f", preco) + ", " + quantidade + " units, Total: $ " + String.format(
                "%.2f%n", TotalValueInStock());
    }

}
