public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Endereco enderecoDaPessoa1 = new Endereco("Rua ABC", "86870-000", "Centro");
        Pessoa pessoa1 = new Pessoa("Maylla",18, "000.000.000-00");

        pessoa1.falar("Hello world!");

    }
}