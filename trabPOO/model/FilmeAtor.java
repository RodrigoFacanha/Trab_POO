package model;

import java.util.ArrayList;

public class FilmeAtor {
    private int idFilmeAtor;
    private Ator ator;
    private Filme filme;
    private String personagem;
    private boolean principal;

    public FilmeAtor(int idFilmeAtor, Ator ator, Filme filme, String personagem, boolean principal) {
        this.idFilmeAtor = idFilmeAtor;
        this.ator = ator;
        this.filme = filme;
        this.personagem = personagem;
        this.principal = principal;
}

public int getIdFilmeAtor() {
    return idFilmeAtor;
}
public void setIdFilmeAtor(int idFilmeAtor) {
    this.idFilmeAtor = idFilmeAtor;
}
public Ator getAtor() {
    return ator;
}
public void setAtor(Ator ator) {
    this.ator = ator;
}
public Filme getFilme() {
    return filme;
}
public void setFilme(Filme filme) {
    this.filme = filme;
}
public String getPersonagem() {
    return personagem;
}
public void setPersonagem(String personagem) {
    this.personagem = personagem;
}
public boolean isPrincipal(){
    return principal;
}
public void setPrincipal(boolean principal) {
    this.principal = principal;
}

@Override 
        public String toString() {
            return "FilmeAtor [Ator= " + ator + "Filme= " + filme + "Personagem= " + personagem;
        }

        
public boolean cadastrar(FilmeAtor filmeAtor) {
        System.out.println("Cadastrar ator: " + filmeAtor.getFilme().getTitulo() +
                ", Ator: " + filmeAtor.getAtor().getNome());
        return true;
    }
    public boolean editar(FilmeAtor filmeAtor) {
        System.out.println("Editar ator: " + filmeAtor.getFilme().getTitulo() +
                ", Ator: " + filmeAtor.getAtor().getNome());
        return true;
    }
    public FilmeAtor consultar(FilmeAtor filmeAtor) {
        System.out.println("Consultar ator: " + filmeAtor.getFilme().getTitulo() +
                ", Ator: " + filmeAtor.getAtor().getNome());
        return filmeAtor;
    }
    public ArrayList<FilmeAtor> listar(ArrayList<FilmeAtor> filmeAtores) {
        System.out.println("Lista de atores nos filmes");
        for (FilmeAtor fa : filmeAtores) {
            System.out.println("Filme: " + fa.getFilme().getTitulo() +
                    ", Ator: " + fa.getAtor().getNome() +
                    ", Personagem: " + fa.getPersonagem() +
                    ", Principal: " + (fa.isPrincipal() ? "Sim" : "Não"));
        }
        return filmeAtores;
    }
}
