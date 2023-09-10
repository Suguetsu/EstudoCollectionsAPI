package main.java.List.OperacoesBasicas.Ex01;

public class Tarefa {

    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;

    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;

      


    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



}