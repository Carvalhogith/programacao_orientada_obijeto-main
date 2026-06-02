
public class App {

    public static void main(String[] args) throws Exception {

        Livro[] estante = new Livro[3];

        estante[0] = new Livro("Harrey potter", "J. K. Rowling");
        estante[1] = new Livro("O codigo Davicni", "Don brow");
        estante[2] = new Livro("Senhor dos aneis", "Lefoe J. L.");

         for (int i = 0; i < estante.length; i++) {
            System.out.println(estante[i].getTitulo());
             
         }

    }
}
