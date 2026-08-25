public class LoginEspecial extends Login {
    private String dica;

    public LoginEspecial(String nome, String senha, String dica) {
        super(nome, senha);
        this.dica = dica;
    }

    public String getDica() {
        return this.dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }

    public static void main(String[] args) {
        // c) Instância de LoginEspecial utilizando uma variável do tipo Login
        Login login = new LoginEspecial("eduardo", "123", "Minha Dica");
        
        // Imprime a dica usando o método getDica() (com casting para a subclasse)
        System.out.println(((LoginEspecial) login).getDica());
    }
}

class TesteLoginEspecial {
    public static void main(String[] args) {
        LoginEspecial login = new LoginEspecial("eduardo", "123", "dica");
        System.out.println(login.getDica());
    }
}
