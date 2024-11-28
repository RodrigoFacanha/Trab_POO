package model;

import java.util.ArrayList;

public class Genero {
    private int id;
    private String descricao;
    private String status;

    public Genero(int id, String descricao, String status){
        this.id = id;
        this.descricao = descricao;
        this.status = status;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public boolean cadastrar(Genero genero) {
        System.out.println("Cadastrar gênero: " + genero.getDescricao());
        return true;
    }
    public boolean editar(Genero genero) {
        System.out.println("Editar gênero: " + genero.getDescricao());
        return true;
    }
    public Genero consultar(Genero genero) {
        System.out.println("Consultar gênero: " + genero.getDescricao());
        return genero;
    }
    public ArrayList<Genero> listar(ArrayList<Genero> generos) {
        System.out.println("Gêneros listados");
        for (Genero g : generos) {
            System.out.println("Gênero: " + g.getDescricao());
        }
        return generos;
    }
}

