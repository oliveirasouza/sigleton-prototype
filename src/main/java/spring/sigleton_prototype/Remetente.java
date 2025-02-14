package spring.sigleton_prototype;

import org.springframework.stereotype.Component;



public class Remetente {
    private  String nome;
    private  String email;

    public Remetente() {
        // Default constructor
    }

    public Remetente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Remetente{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}