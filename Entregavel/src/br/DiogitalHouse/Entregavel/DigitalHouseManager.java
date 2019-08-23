package br.DiogitalHouse.Entregavel;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> listaDeAluno;
    private List<Professor> listaDeProfessores =  new ArrayList<>();
    private List<Curso> listaDeCurso = new ArrayList<>();
    private List<Matricula> listaDeMatricula = new ArrayList<>();


    public DigitalHouseManager(List<Aluno> listaDeAluno, List<Professor> listaDeProfessores, List<Curso> listaDeCurso, List<Matricula> listaDeMatricula) {
        this.listaDeAluno = listaDeAluno;
        this.listaDeProfessores = listaDeProfessores;
        this.listaDeCurso = listaDeCurso;
        this.listaDeMatricula = listaDeMatricula;
    }


    public String Dados() {
        return "DigitalHouseManager{" +
                "listaDeAluno=" + listaDeAluno +
                ", listaDeProfessores=" + listaDeProfessores +
                ", listaDeCurso=" + listaDeCurso +
                ", listaDeMatricula=" + listaDeMatricula +
                '}';
    }




    public List<Aluno> getListaDeAluno() {
        return listaDeAluno;
    }

    public void setListaDeAluno(List<Aluno> listaDeAluno) {
        this.listaDeAluno = listaDeAluno;
    }

    public List<Professor> getListaDeProfessores() {
        return listaDeProfessores;
    }

    public void setListaDeProfessores(List<Professor> listaDeProfessores) {
        this.listaDeProfessores = listaDeProfessores;
    }

    public List<Curso> getListaDeCurso() {
        return listaDeCurso;
    }

    public void setListaDeCurso(List<Curso> listaDeCurso) {
        this.listaDeCurso = listaDeCurso;
    }

    public List<Matricula> getListaDeMatricula() {
        return listaDeMatricula;
    }

    public void setListaDeMatricula(List<Matricula> listaDeMatricula) {
        this.listaDeMatricula = listaDeMatricula;
    }
}
