package br.DiogitalHouse.Entregavel;

import java.util.Date;

public class Matricula {

    private Aluno aluno;
    private Curso curso;
    private Date dataDaMatricula = new Date();


    public Matricula(Aluno aluno, Curso curso, Date dataDaMatricula) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataDaMatricula = dataDaMatricula;
    }


    public String Dados() {
        return "Matricula{" +
                "aluno=" + aluno +
                ", curso=" + curso +
                ", dataDaMatricula=" + dataDaMatricula +
                '}';
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getDataDaMatricula() {
        return dataDaMatricula;
    }

    public void setDataDaMatricula(Date dataDaMatricula) {
        this.dataDaMatricula = dataDaMatricula;
    }
}
