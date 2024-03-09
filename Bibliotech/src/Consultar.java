public class Consultar extends Livro {

    private String titulo;
    private String autor;
    private Integer ISBN;

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public Integer getISBN() {
        return ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    @Override
    public void setAutor(String autor) {
        this.autor = autor;
    }
    @Override
    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

}
