import java.util.ArrayList;
public class TesteAdapter {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        RepositorioAluno repositorio = new RepositorioAlunoAdapter(lista);
        repositorio.cadastrar(
        new Aluno("2026001", "Ana Silva", "ana@email.com"));
        repositorio.cadastrar(
        new Aluno("2026002", "Carlos Souza", "carlos@email.com"));
        repositorio.cadastrar(
        new Aluno("2026003", "Marina Santos", "marina@email.com"));
        boolean duplicado = repositorio.cadastrar(
        new Aluno("2026002", "Outro aluno", "outro@email.com"));
        System.out.println("Cadastro duplicado: " + duplicado);
        System.out.println("\nAlunos cadastrados:");
        System.out.println(repositorio.listar());
        System.out.println("Busca da matricula 2026002:");
        System.out.println(repositorio.buscar("2026002"));
        System.out.println("\nExclusao da matricula 2026001:");
        System.out.println(repositorio.excluir("2026001"));
        System.out.println("\nQuantidade: " + repositorio.quantidade());
        System.out.println("\nLista atualizada:");
        System.out.println(repositorio.listar());
    }
}