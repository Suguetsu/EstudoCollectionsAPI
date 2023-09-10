package main.java.List.OperacoesBasicas.Ex04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> listPessoa;

    public OrdenacaoPessoas() {

        this.listPessoa = new ArrayList<>(0);
    }

    /**
     * Adiciona pessoa na lista
     * 
     * @param nome
     * @param idade
     * @param altura
     */

    public void AdicionaPessoa(String nome, int idade, double altura) {

        Pessoa pessoa = new Pessoa(nome, idade, altura);
        listPessoa.add(pessoa);

    }

    public void OrdenarAscendente() {

        System.out.println("Não implementado");

    }

    public void OrdenarDescendete() {
        System.out.println("Não implementado");
    }

    public List<Pessoa> OrdenarPessoasPorIdade() {

        List<Pessoa> pessoasPorIdade = new ArrayList<>(listPessoa);
        Collections.sort(pessoasPorIdade); // acessa o metodo comparable do objeto e usa o metodo para reclassificar oo
                                           // array
        return pessoasPorIdade;

    }

    public List<Pessoa> OrdenarPorAltura() {

        List<Pessoa> pessoasPorAltura = new ArrayList<>(listPessoa);
        Collections.sort(pessoasPorAltura, new CompararObjeto()); // acessa a class comparator do objeto e usa o metodo
                                                                  // para reclassificar oo
        // array
        return pessoasPorAltura;

    }

    public static void main(String[] args) {
        OrdenacaoPessoas p = new OrdenacaoPessoas();

        p.AdicionaPessoa("Rafael", 55, 1.65);
        p.AdicionaPessoa("Rodrigo", 32, 1.75);
        p.AdicionaPessoa("Enzo ", 17, 1.85);
        p.AdicionaPessoa("Eduardo", 17, 1.78);

     
        System.out.println(p.OrdenarPorAltura());
        System.out.println(p.OrdenarPessoasPorIdade());

    }

}
