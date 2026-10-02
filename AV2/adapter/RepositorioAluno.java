public interface RepositorioAluno {
    boolean cadastrar(Aluno aluno);
    Aluno buscar(String matricula);
    boolean excluir(String matricula);
    int quantidade();
    String listar();
}
