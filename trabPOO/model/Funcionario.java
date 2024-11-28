package model;

import java.util.ArrayList;
import java.util.Date;

public class Funcionario extends Pessoa {
    private int matricula;
    private Date horarioTrabalho;

    public Funcionario(String cpf, String nome, String email, int matricula, Date horarioTrabalho) {
        super(cpf, nome, email);
        this.matricula = matricula;
        this.horarioTrabalho = horarioTrabalho;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public Date getHorarioTrabalho() {
        return horarioTrabalho;
    }
    public void setHorarioTrabalho(Date horarioTrabalho) {
        this.horarioTrabalho = horarioTrabalho;
    }

    @Override
    public String toString() {
        return "Funcionario{ matricula= " + matricula + ", horarioTrabalho= " + horarioTrabalho;
    }


    public boolean cadastrar(Funcionario funcionario) {
        System.out.println("Cadastrando funcionário: " + funcionario.getNome());
        return true;
    }
    public boolean editar(Funcionario funcionario) {
        System.out.println("Editando informações do funcionário: " + funcionario.getNome());
        return true;
    }
    public Funcionario consultar(Funcionario funcionario) {
        System.out.println("Consultando funcionário: " + funcionario.getNome());
        return funcionario;
    }
    public ArrayList<Funcionario> listar(ArrayList<Funcionario> funcionarios) {
        System.out.println("Listando funcionários...");
        for (Funcionario f : funcionarios) {
            System.out.println("Funcionário: " + f.getNome());
        }
        return funcionarios;
    }
}

