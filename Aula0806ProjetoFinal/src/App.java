
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Quarto[] quartos = new Quarto[5];

        Scanner tecldo = new Scanner(System.in);

        quartos[0] = new QuartoSimples(101, 100.00);
        quartos[1] = new QuartoLuxo(102, 200.00);
        quartos[2] = new QuartoSimples(103, 100.00);
        quartos[3] = new QuartoLuxo(104, 200.00);
        quartos[4] = new QuartoSimples(105, 100.00);

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Hospedagem> hospedagens = new ArrayList<>();

        int opcao;

        do {

            System.out.println("Mapas dos Quadros");

            for (Quarto quarto : quartos) {

                if (quarto.getIsOcupado()) {
                    System.out.println(quarto.getNumero() + "-[Ocupado]");

                } else {
                    System.out.println(quarto.getNumero() + "-[Livre]");
                }

            }

            System.out.println("=============================");

            System.out.println(" 1-Cadastar cliente ");
            System.out.println(" 2-Check-in");
            System.out.println(" 3-Check-out");
            System.out.println(" 4-Blanço de caixa");
            System.out.println(" 5-Sair ");

            System.out.println("Digite uma opção");
            opcao = tecldo.nextInt();
            tecldo.nextLine();
            switch (opcao) {

                case 1:
                    System.out.println("Digite o nome do cliente: ");
                    String nome = tecldo.nextLine();

                    System.out.println("Digite o CPF do cliente: ");
                    String cpf = tecldo.nextLine();

                    clientes.add(new Cliente(nome, cpf));
                    break;

                case 2:

                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println(i + "-" + clientes.get(i).getNome());
                    }

                    System.out.println("Digite o indice do cliente: ");
                    int cid = tecldo.nextInt();

                    System.out.println("Digite o numero do quarto: ");
                    int numeroQuarto = tecldo.nextInt();

                    System.out.println("Digite o numero de diarias");
                    int numeroDiarias = tecldo.nextInt();

                    for (Quarto quarto : quartos) {
                        if (!quarto.getIsOcupado() && quarto.getNumero() == numeroQuarto) {
                            quarto.setIsOcupado(true);
                            hospedagens.add(new Hospedagem(quarto, clientes.get(cid), numeroDiarias));
                            System.out.println("Hospedagem criada com sucesso");
                        }
                    }

                case 3:
                    System.out.println("Digite o numero do quarto para checkout");
                    int nOut = tecldo.nextInt();

                    for (Hospedagem hospedagem : hospedagens) {
                        if (hospedagem.getQuarto().getNumero() == nOut && hospedagem.getIsAtiva());

                        double total = hospedagem.getQuarto().calcularTotal(hospedagem.getDiarias());
                        System.out.println("Total a pagar: R$" + total);
                        hospedagem.getQuarto().setIsOcupado(false);
                        hospedagem.setIsAtiva(false);
                        hospedagem.setValorTotal(total);
                        System.out.println("Checkout realizado");
                        break;

                    }

                case 4:
                    double totalCaixa = 0.0;
                    for (Hospedagem hospedagem : hospedagens) {

                        if (!hospedagem.getIsAtiva()) {
                            totalCaixa += hospedagem.getValorTotal();

                        }

                    }

                    System.out.println("Balanço total: R$" + totalCaixa);
                    break;

                case 5:
                    System.out.println("Fechando o Programa");
                    break;
                default:
                    System.out.println("operação inválida");
            }

        } while (opcao != 5);

    }
}
