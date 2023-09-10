package main.java.List.OperacoesBasicas.Ex01;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> listaTarefa;

    public ListaTarefa() {

        this.listaTarefa = new ArrayList<>();
    }

    // adiciona tarefa
    public void AdicionarTarefa(String descricao) {

        listaTarefa.add(new Tarefa(descricao));

    }

    // Remove tarefa
    public void RemoverTarefa(String descricao) {

        if (!listaTarefa.isEmpty()) {

            List<Tarefa> removerTarefa = new ArrayList<>();

            for (Tarefa t : listaTarefa) {

                if (t.getDescricao().equals(descricao)) {
                    removerTarefa.add(t);

                }

            }

            listaTarefa.removeAll(removerTarefa);
        }

    }

    // Pega o tamanho da lista
    public int ObterTarefa() {

        return listaTarefa.size();
    }

    // Descreve os itens da lista

    public void ObterDescricoesTarefa() {

      System.out.println(listaTarefa);

    }

    public static void main(String[] args) {

        
         

    }

}
