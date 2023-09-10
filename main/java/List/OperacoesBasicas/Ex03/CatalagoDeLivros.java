package main.java.List.OperacoesBasicas.Ex03;

import java.util.ArrayList;
import java.util.List;

public class CatalagoDeLivros {

    private List<Livro> livroList;

    public CatalagoDeLivros() {

        this.livroList = new ArrayList<>();
    }

    public void AdicionarLivro(String autor, String titulo, int anoPublicacao) {

        Livro l = new Livro(titulo, autor, anoPublicacao);
        livroList.add(l);

        System.out.println("Livro cadastrado!" + "Quantidade de livros: " + livroList.size());

    }

    /**
     * 
     * @param autor
     * @return persquisa por autor
     * 
     */
    public List<Livro> PesquisaPorAutor(String autor) {

        List<Livro> autores = new ArrayList<>();

        if (!autor.isEmpty() && !livroList.isEmpty()) {

            for (Livro l : livroList) {

                if (l.getAutor().equalsIgnoreCase(autor)) {

                    autores.add(l);
                }

            }

            return autores;

        }

        System.out.println("Autor não Cadastrado!");
        return null;
    }

    /**
     * 
     * @param in
     * @param fim
     * @return Pesquisa por intervalo de tempo
     */
    public List<Livro> LivroPorIntervaloDeAnos(int in, int fim) {

        List<Livro> livros = new ArrayList<>();

        if (!livroList.isEmpty()) {

            for (Livro l : livroList) {

                if (l.getAnoPublicacao() >= in && l.getAnoPublicacao() <= fim) {

                    livros.add(l);
                }

            }

            return livros;

        }

        System.out.println("Livro não Cadastrado!");
        return null;
    }

    public Livro PesquisaPorTitulo(String titulo) {

        Livro a = null;

        if (!livroList.isEmpty()) {

            for (Livro l : livroList) {

                if (l.getTitulos().equalsIgnoreCase(titulo)) {

                    a = l;
                    System.out.println("Livro encontrado!");
                    break;

                }

            }

            return a;

        }

        System.out.println("Livro não Cadastrado!");
        return a;
    }

    public static void main(String[] args) {

        CatalagoDeLivros a = new CatalagoDeLivros();

        a.AdicionarLivro("Abra Jamil", "Comedor de Corvos", 2024);
        a.AdicionarLivro("Romeu Santos", "Um vaco no peito", 2035);

        // System.out.println(a.PesquisaPorAutor("Romeu Santos"));
        System.out.println(a.PesquisaPorTitulo("Um vaco no peito"));
        System.out.println(a.PesquisaPorAutor("Romeu Santos"));
        System.out.println(a.LivroPorIntervaloDeAnos(2020, 2060));

    }

}
