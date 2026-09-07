package fib;

import java.util.Objects;

public interface IF_Contato {
    String getNome();
    String getTelefone();
    void setNome(String nome);
    void setTelefone(String telefone);
}

class Contato implements IF_Contato {
    private String nome;
    private String telefone;

    public Contato() {
    }

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getTelefone() {
        return this.telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Contato outro = (Contato) o;
        if (this.telefone == null) {
            return outro.telefone == null;
        }
        return this.telefone.equals(outro.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.telefone);
    }

    @Override
    public String toString() {
        return "Contato{nome='" + this.nome + "', telefone='" + this.telefone + "'}";
    }
}

class MainTesteContato {
    public static void main(String[] args) {
        IF_Contato c = new Contato();
        c.setNome("Eduardo");
        c.setTelefone("71999999999");
        System.out.println(c);
    }
}