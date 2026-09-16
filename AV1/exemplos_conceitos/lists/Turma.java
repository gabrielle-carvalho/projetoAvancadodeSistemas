public class Turma {
    private String disciplina;
    // Utiliza um Map para indexar o Aluno através de uma chave String
    private Map<String, Aluno> alunos;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Map<String, Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Map<String, Aluno> alunos) {
        this.alunos = alunos;
    }

    public static void main(String[] args) {
        Turma turmaA = new Turma();
        turmaA.setAlunos(new HashMap<String, Aluno>());

        Aluno jose = new Aluno();
        jose.setMatricula("ABC123");
        // O método put adiciona a chave (matrícula) e o valor (objeto aluno)
        turmaA.getAlunos().put(jose.getMatricula(), jose);

        Aluno pedro = new Aluno();
        pedro.setMatricula("EDF456");
        turmaA.getAlunos().put(pedro.getMatricula(), pedro);
        
        System.out.println("Alunos na Turma: " + turmaA.getAlunos().size());
    }
}
