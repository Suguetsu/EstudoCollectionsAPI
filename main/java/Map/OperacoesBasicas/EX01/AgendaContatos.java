package main.java.Map.OperacoesBasicas.EX01;

import java.util.HashMap;
import java.util.Map;



public class AgendaContatos {

    private Map<String, Integer> AgendaContatosMap;

    public AgendaContatos() {
        AgendaContatosMap = new HashMap<>();
    }

    public void AdicionarContatos(String nome, Integer telefone) {
        AgendaContatosMap.put(nome, telefone);// adiciona e atualiza (put)
    }

    public void RemoverContato(String nome) {
        if (!AgendaContatosMap.isEmpty()) {
            AgendaContatosMap.remove(nome);
        }
    }

    public void ExibirContato() {
        System.out.println(AgendaContatosMap);
    }

    public Integer PesquisarPornome(String nome) {

        Integer numeroDetelefone = 0;

        if (!AgendaContatosMap.isEmpty())
            numeroDetelefone = AgendaContatosMap.get(nome);

        return numeroDetelefone;
    }

    public static void main(String[] args) {

        AgendaContatos agenda = new AgendaContatos();

        agenda.AdicionarContatos("Janio", 55555);
        agenda.AdicionarContatos("Jurema", 66666);
        agenda.AdicionarContatos("Jordelina", 77777);

        agenda.ExibirContato();

        agenda.RemoverContato("Janio");

        agenda.ExibirContato();

    }

   

}
