public class App {
    public static void main(String[] args) throws Exception {
        Livro livro1 = new Livro();

        livro1.titulo = "Harry potter 1";
        livro1.autor = "J. k. Rowling";
        livro1.disponivel = true;

        livro1.emprestar();
        livro1.emprestar();

        livro1.devolver();
        livro1.devolver();

    }
}
