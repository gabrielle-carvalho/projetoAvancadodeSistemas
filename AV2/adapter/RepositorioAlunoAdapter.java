import java.util.ArrayList;

public class RepositorioAlunoAdapter implements RepositorioAluno {
    private ArrayList<Aluno> lista;

    public RepositorioAlunoAdapter(ArrayList<Aluno> lista) {
        this.lista = lista;
    }

    @Override
    public boolean cadastrar(Aluno aluno) {
        if (buscar(aluno.getMatricula()) != null) {
            return true;
        }
        lista.add(aluno);
        return false;
    }

    @Override
    public Aluno buscar(String matricula) {
        for (Object obj : lista) {
            Aluno a = (Aluno) obj;
            if (a.getMatricula().equals(matricula)) {
                return a;
            }
        }
        return null;
    }

    @Override
    public boolean excluir(String matricula) {
        Aluno a = buscar(matricula);
        if (a != null) {
            return lista.remove(a);
        }
        return false;
    }

    @Override
    public int quantidade() {
        return lista.size();
    }

    @Override
    public String listar() {
        StringBuilder sb = new StringBuilder();
        for (Object obj : lista) {
            sb.append(obj.toString()).append("\n");
        }
        return sb.toString();
    }
}