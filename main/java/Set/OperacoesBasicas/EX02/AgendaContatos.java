package main.java.Set.OperacoesBasicas.EX02;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> setContato;

    public AgendaContatos() {
        this.setContato = new HashSet<>();
    }

    public void AdicionarContato(String nome, int numero) {
        Contato c = new Contato(nome, numero);
        setContato.add(c);

    }

    public Set<Contato> ExibirContatos() {

        return setContato;
    }

    public Set<Contato> PesquisarPorNome(String nome) {

        Set<Contato> nomePesquisado = new HashSet<>();

        for (Contato c : setContato) {

            if (c.getNome().startsWith(nome)) {

                nomePesquisado.add(c);

            }
        }

        return nomePesquisado;

    }

    public Contato AtualizarNumeroContato(String nome, int novoNumero) {

        Contato AtualizarNumero = null;

        for (Contato c : setContato) {

            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                AtualizarNumero = c;

            }
        }

        return AtualizarNumero;

    }

    public static void main(String[] args) {

        AgendaContatos contato = new AgendaContatos();

        contato.AdicionarContato("Rodrigo", 55);
        contato.AdicionarContato("Rodrigo", 32);
        contato.AdicionarContato("Rodrigo enzo", 17);
        contato.AdicionarContato("Rodrigo Moraes", 55);

        System.out.println(contato.ExibirContatos());
        contato.AtualizarNumeroContato("Rodrigo", 7777);
        System.out.println(contato.ExibirContatos());

        System.out.println(contato.PesquisarPorNome("enzo"));

    }

}
