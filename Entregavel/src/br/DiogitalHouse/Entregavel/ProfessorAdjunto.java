package br.DiogitalHouse.Entregavel;

import java.util.Objects;

public class ProfessorAdjunto extends Professor {

    private Integer codigoProfessor;
    private Integer quantidadeDeHorasDeMonitoria;


    public ProfessorAdjunto(String nome, String sobreNome, Integer tempoDeCasa, Integer codigoProfessor) {
        super(nome, sobreNome, tempoDeCasa, codigoProfessor);
    }

    @Override
    public String Dados() {
        return "ProfessorAdjunto{" +
                "codigoProfessor=" + codigoProfessor +
                ", quantidadeDeHorasDeMonitoria=" + quantidadeDeHorasDeMonitoria +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProfessorAdjunto that = (ProfessorAdjunto) o;
        return Objects.equals(codigoProfessor, that.codigoProfessor);
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

    public Integer getQuantidadeDeHorasDeMonitoria() {
        return quantidadeDeHorasDeMonitoria;
    }

    public void setQuantidadeDeHorasDeMonitoria(Integer quantidadeDeHorasDeMonitoria) {
        this.quantidadeDeHorasDeMonitoria = quantidadeDeHorasDeMonitoria;
    }
}
