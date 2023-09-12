package main.java.Map.OperacoesBasicas.EX02;



public class Produtos {

    private String nome;
    private long cod;
    private int quantidade;
    private double preco;


    
    public Produtos(String nome, long cod, int quantidade, double preco) {
        this.nome = nome;
        this.cod = cod;
        this.quantidade = quantidade;
        this.preco = preco;
    }



    public String getNome() {
        return nome;
    }



    public long getCod() {
        return cod;
    }



    public int getQuantidade() {
        return quantidade;
    }



    public double getPreco() {
        return preco;
    }



    @Override
    public String toString() {
        return "EstoqueProduto [nome=" + nome + ", cod=" + cod + ", quantidade=" + quantidade + ", preco=" + preco
                + "]";
    }
    
}
