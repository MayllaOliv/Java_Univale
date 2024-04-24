class Aluno extends Usuario {
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Aluno(String nome, String serie) {
        super(nome, serie);
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
        disciplina.matricularAluno(this);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public Nota getNota(Disciplina disciplina) {
        return null;
    }

    public boolean estaAprovado(Disciplina disciplina) {
        return false;
    }
}

