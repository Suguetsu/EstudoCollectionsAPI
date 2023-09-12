package main.java.Set.OperacoesBasicas.Ex01;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> setConvidados;

    public ConjuntoConvidados() {

        this.setConvidados = new HashSet<>();
    }

    public void AdicionarConvidado(String nome, int codigo) {

        Convidado c = new Convidado(nome, codigo);

        setConvidados.add(c);

    }

    public void RemoverConvidado(int codigo) {

        Convidado c = null;

        if (!setConvidados.isEmpty()) {

            for (Convidado convidadoRemover : setConvidados) {

                if (convidadoRemover.getCodigoConvite() == codigo) {

                    c = convidadoRemover;
                    break;

                }
            }

            setConvidados.remove(c);

        }

    }

    public int ContarConvidados() {
        return setConvidados.size();
    }

    public void ExibirConvidados() {

        System.out.println(setConvidados);
    }

    public static void main(String[] args) {

        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.AdicionarConvidado("Rafael", 55);
        convidados.AdicionarConvidado("Rodrigo", 32);
        convidados.AdicionarConvidado("Enzo ", 17);
        convidados.AdicionarConvidado("Eduardo", 55);

        System.out.println(convidados.ContarConvidados());
        convidados.ExibirConvidados();

        convidados.RemoverConvidado(55);

        System.out.println(convidados.ContarConvidados());
        convidados.ExibirConvidados();

    }

}
