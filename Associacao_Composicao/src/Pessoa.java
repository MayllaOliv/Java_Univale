public class Pessoa {
    private String nome;
    private Integer idade;
    private String cpf;
    private Endereco endereco;

    public Pessoa (String nome, Integer idade, String cpf, Endereco endereco) {
        this.nome = nome; // A prorpiedade nome recebe o valor do parametro nome //
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    public void falar(String frase) {
        System.out.println(frase);
    }
}
