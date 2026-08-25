public class Login {
    protected String nome;
    protected String senha;

    public Login(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSenha() {
        return this.senha;
    }

    public boolean verificaLogin(String nome, String senha) {
        return (this.nome.equals(nome) && this.senha.equals(senha));
    }

    public static void main(String[] args) {
        // a) Criar instância com nome = "eduardo" e senha = "123"
        Login meuLogin = new Login("eduardo", "123");

        // Imprimir retorno do método verificaLogin com nome = "carlos" e senha = "123"
        System.out.println(meuLogin.verificaLogin("carlos", "123"));
    }
}