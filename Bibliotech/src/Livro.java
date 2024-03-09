public class Livro {

    private String titulo;
    private String autor;
    private String editora;
    private Integer ano;
    private Integer ISBN;


    public Livro(String titulo, String autor, String editora, String ano, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public Integer getAno() {
        return ano;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}

