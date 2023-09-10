package main.java.List.OperacoesBasicas.EX02;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> carrinho;

    public CarrinhoDeCompras() {
        carrinho = new ArrayList<>();
    }

    // adiciona item ao carrinho
    public void AdicionarItem(String n, double p, int qnt) {

        Item i = new Item(n, p, qnt);
        carrinho.add(i);

    }

    // remove item do carrinho
    public void RemoverItem(String n) {

        List<Item> remover = new ArrayList<>();

        for (Item i : carrinho) {

            if (i.getNome().equals(n)) {

                remover.add(i);
            }
        }

        carrinho.removeAll(remover);

    }

    // Calcula valor total do carrinho

    public int CalcularValor() {

        int localValue = 0;

        for (Item i : carrinho) {

            localValue += (i.getQuantidade() * i.getPreco());

        }

        return localValue;

    }

    public void ExibirItens() {

        System.out.println(carrinho);
    }

}
