package model;

public class Ator extends Pessoa {
    private int registro;

    public Ator(String cpf, String nome, String email, int registro) {
        super(cpf, nome, email);
        this.registro = registro;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    @Override 
    public String toString(){
        return "Ator [Nome =" + getNome() + ", registro =" + registro;
    }
}