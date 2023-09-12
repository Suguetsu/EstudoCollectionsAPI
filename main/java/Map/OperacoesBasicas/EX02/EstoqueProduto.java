package main.java.Map.OperacoesBasicas.EX02;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {

    Map<String, Produtos> produtosMap;

    public EstoqueProduto() {
        this.produtosMap = new HashMap<>();
    }

    public void AdicionarProdutos(String nome, long cod, int quantidade, double preco) {

        produtosMap.put(nome, new Produtos(nome, cod, quantidade, preco));
    }

    public void ExibirProdutos() {

        System.out.println(produtosMap);
    }

    public double CalcularValorTotalEsoque() {

        double value = 0;

        for (Produtos p : produtosMap.values()) {

            if (!produtosMap.isEmpty()) {

                value += p.getPreco() * p.getQuantidade();

            }

        }

        return value;

    }

    public Produtos ProdutoMaisCaro() {

        Produtos produtoMaisCaro = null;
        double value = Double.MIN_VALUE;

        for (Produtos p : produtosMap.values()) {

            if (!produtosMap.isEmpty() && p.getPreco() > value) {

                value = p.getPreco();
                produtoMaisCaro = p;
            }

        }

        return produtoMaisCaro;

    }

    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();

        estoque.AdicionarProdutos("Espelho", 5555, 100, 20);
        estoque.AdicionarProdutos("Cadeira", 6666, 20, 15f);
        estoque.AdicionarProdutos("Mesa", 5555, 100, 2);
        estoque.AdicionarProdutos("Relogio", 8888, 1, 1000);
        estoque.AdicionarProdutos("Livro", 1111, 3, 3);

        System.out.println("O valor do estoque é " + estoque.CalcularValorTotalEsoque());
        estoque.ExibirProdutos();

        System.out.println("O produto mais caro é " + estoque.ProdutoMaisCaro());

    }

}
