
public class App {

    public static void main(String[] args) throws Exception {
        Aluno[] classe = new Aluno[4];
        classe[0] = new Aluno("Rodrigo", 9,7);
        classe[1] = new Aluno("João", 5,7);
        classe[2] = new Aluno("Luiz", 6,7);
        classe[3] = new Aluno("Fer", 3,7);

        double somasNotas = 0;

        for (int i = 0; i < classe.length; i++) {
            somasNotas += classe[i].getMedia();

            
        }
        System.out.println("Média da turma:" +somasNotas / classe.length);
    }
}
