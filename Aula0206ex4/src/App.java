
import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception {

        ArrayList<Musica> lista = new ArrayList<>();

        lista.add(new Musica("casinha", "Armandinho"));
        lista.add(new Musica("por do sol", "Armandinho"));

        for (Musica m : lista) {

            System.out.println("tocando " + m.gettitulo() + " - " + m.getartista());

        }

    }
}
