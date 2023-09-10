package main.java.List.OperacoesBasicas.Ex03;

public class Livro {

    private String titulos;
    private String autor;
    private int anoPublicacao;
    public Livro(String titulos, String autor, int anoPublicacao) {
        this.titulos = titulos;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    /**
     * @return String return the titulos
     */
    public String getTitulos() {
        return titulos;
    }

    /**
     * @param titulos the titulos to set
     */
    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    /**
     * @return String return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return int return the anoPublicacao
     */
    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    /**
     * @param anoPublicacao the anoPublicacao to set
     */
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }



    @Override
    public String toString(){
        return "Autor: "+ autor + " Título: " +titulos + " Ano: " + anoPublicacao;
    }
}
