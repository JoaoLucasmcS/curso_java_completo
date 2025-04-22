package q5_contaBancaria.Entities;

public class ContaBancaria {

    private final int accountCod;
    private String nomeDoTitular;
    private double valorNaConta;
    private static final double TAXA_SAQUE = 5.0;

    public ContaBancaria(int accountCod, String nomeDoTitular, double valorDepositoInicial){
        this.accountCod = accountCod;
        this.valorNaConta = valorDepositoInicial;
        this.nomeDoTitular = nomeDoTitular;
    }

    public ContaBancaria(int accountCod, String nomeDoTitular){
        this.accountCod = accountCod;
        this.nomeDoTitular = nomeDoTitular;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public double getValorNaConta() {
        return valorNaConta;
    }

    public void depositar(double valorASerDepositado){
        valorNaConta += valorASerDepositado;
    }

    public void sacar(double valorASerSacado){
        valorNaConta -= valorASerSacado + TAXA_SAQUE;
    }

    @Override
    public String toString() {
        return "Informações da Conta Bancária:\n" +
                "Código do Cliente: = " + accountCod +
                "\nNome do Cliente: = " + nomeDoTitular +
                "\nValor na Conta: = R$ " + valorNaConta;
    }
}
