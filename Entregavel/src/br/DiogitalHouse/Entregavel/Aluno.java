package br.DiogitalHouse.Entregavel;

import java.util.Objects;

public class Aluno {

    private String nome;
    private String sobreNome;
    private Integer codigoAlunos;


    public Aluno(String nome, String sobreNome, Integer codigoAlunos) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.codigoAlunos = codigoAlunos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(codigoAlunos, aluno.codigoAlunos);
    }


    public String Dados() {
        return "Aluno{" +
                "nome:" + nome + '\'' +
                ", sobreNome:" + sobreNome + '\'' +
                ", codigoAlunos:" + codigoAlunos;
    }

    @Override
    public int hashCode() {

        return Objects.hash(codigoAlunos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Integer getCodigoAlunos() {
        return codigoAlunos;
    }

    public void setCodigoAlunos(Integer codigoAlunos) {
        this.codigoAlunos = codigoAlunos;
    }
}