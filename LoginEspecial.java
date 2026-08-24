public class LoginEspecial Login {
    private String dica;
    public LoginEspecial(String nome,String senha, String dica){
        super(nome,senha);
        this.dica=dica;
    }
    public String getDica() {
        return this.dica;
    }
    public void setDica(String dica) {
        this.dica = dica;
    }

}

class TesteLoginEspecial {
    public static void main(String[] args) {
        LoginEspecial login = new LoginEspecial("eduardo", "123", "dica");
        System.out.println(login.getDica());
    }
}
