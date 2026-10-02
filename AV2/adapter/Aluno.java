public class Aluno {
    private String matricula;
    private String nome;
    private String email;
    public Aluno(String matricula, String nome, String email) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
    }
    public String getMatricula() { return matricula; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Aluno aluno = (Aluno) obj;
        return matricula.equals(aluno.matricula);
    }
    @Override
    public String toString() {
        return "Aluno{" + "matricula='" + matricula + '\'' + ", nome='" + nome + '\'' + ", email='" + email + '\'' +'}';
    }
}
