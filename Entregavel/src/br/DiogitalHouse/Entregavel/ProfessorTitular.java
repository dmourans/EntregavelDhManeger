package br.DiogitalHouse.Entregavel;

import java.util.Objects;

public class ProfessorTitular extends Professor {

    private Integer codigoProfessor;
    private String especialidade;


    public ProfessorTitular(String nome, String sobreNome, Integer tempoDeCasa, Integer codigoProfessor) {
        super(nome, sobreNome, tempoDeCasa, codigoProfessor);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProfessorTitular that = (ProfessorTitular) o;
        return Objects.equals(codigoProfessor, that.codigoProfessor);
    }


    @Override
    public String Dados() {
        return "ProfessorTitular{" +
                "codigoProfessor=" + codigoProfessor +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), codigoProfessor);
    }

    @Override
    public Integer getCodigoProfessor() {
        return codigoProfessor;
    }

    @Override
    public void setCodigoProfessor(Integer codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
