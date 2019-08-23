package br.DiogitalHouse.Entregavel;



import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

    private String nome;
    private Integer codigoDoCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private Integer quantidadeMaximaDeAluno;
    private List<Aluno> listaDeAlunos = new ArrayList<>();

    public Curso(String nome, Integer codigoDoCurso, ProfessorTitular professorTitular, ProfessorAdjunto professorAdjunto, Integer quantidadeMaximaDeAluno, List<Aluno> listaDeAlunos) {
        this.nome = nome;
        this.codigoDoCurso = codigoDoCurso;
        this.professorTitular = professorTitular;
        this.professorAdjunto = professorAdjunto;
        this.quantidadeMaximaDeAluno = quantidadeMaximaDeAluno;
        this.listaDeAlunos = listaDeAlunos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(codigoDoCurso, curso.codigoDoCurso);
    }

    @Override
    public int hashCode() {

        return Objects.hash(codigoDoCurso);
    }

     public Boolean adicionarUmAluno(Aluno umAluno){
        if (listaDeAlunos.size()< quantidadeMaximaDeAluno){
            listaDeAlunos.add(umAluno);
            System.out.println("Aluno Matriculado com sucesso!");
            return true;
        }else {
            System.out.println("Não há vagas disponiveis!");
            return false;
        }
     }


    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public Integer getQuantidadeMaximaDeAluno() {
        return quantidadeMaximaDeAluno;
    }

    public void setQuantidadeMaximaDeAluno(Integer quantidadeMaximaDeAluno) {
        this.quantidadeMaximaDeAluno = quantidadeMaximaDeAluno;
    }

    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(List<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoDoCurso() {
        return codigoDoCurso;
    }

    public void setCodigoDoCurso(Integer codigoDoCurso) {
        this.codigoDoCurso = codigoDoCurso;
    }
}
