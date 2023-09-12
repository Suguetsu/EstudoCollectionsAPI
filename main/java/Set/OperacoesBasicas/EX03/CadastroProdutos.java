package main.java.Set.OperacoesBasicas.EX03;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> setProdut;

    public CadastroProdutos() {
        this.setProdut = new HashSet<>();
    }

    public void AdicionarProduto(String nome, int cod, double preco, int quantidade) {

        setProdut.add(new Produto(nome, cod, preco, quantidade));

    }

    public Set<Produto> ExibirProdutoPorNome() {

        Set<Produto> SetEmOrdem = new TreeSet<>(setProdut); // ele deixa organizao por nome, o set não deixa;

        return SetEmOrdem;

    }

    public Set<Produto> ExibirProdutosPorPreco() {

        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        setProdut.addAll(produtoPorPreco);

        return setProdut;

    }

}
