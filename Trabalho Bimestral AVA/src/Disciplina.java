class Disciplina {
    private String nome;
    private List<Aluno> alunosMatriculados = new ArrayList<>();
    private List<Nota> notas = new ArrayList<>();

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void matricularAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);
    }

    public void adicionarNota(Nota nota) {
        notas.add(nota);
    }
}