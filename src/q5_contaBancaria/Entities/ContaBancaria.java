package q5_contaBancaria.Entities;

public class ContaBancaria {

    private int accountCod;
    private String nomeDoTitular;
    private double valorDepositoInicial;

    public ContaBancaria(int accountCod, String nomeDoTitular, double valorDepositoInicial){
        this.accountCod = accountCod;
        this.valorDepositoInicial =valorDepositoInicial;
        this.nomeDoTitular = nomeDoTitular;
    }

    public ContaBancaria(int accountCod, String nomeDoTitular){
        this.accountCod = accountCod;
        this.nomeDoTitular = nomeDoTitular;
    }

    public void set(String nomeDoTitular){
        this.nomeDoTitular = nomeDoTitular;
    }

    public String get(){
        return nomeDoTitular;
    }

}
