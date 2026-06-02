public class Livro {
    private String titulo;
    private String autor;

    public Livro(String tiulo, String autor) {
        this.titulo = tiulo;
        this.autor = autor;


    }

    public String getTitulo() {
        return(this.titulo + this.autor);
    }



}
