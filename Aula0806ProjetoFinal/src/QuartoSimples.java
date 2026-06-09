
public class QuartoSimples extends Quarto {

    public QuartoSimples(int numero, double preçobase) {
        super(numero, preçobase);
    }

    @Override
    public double calcularTotal(int diarias) {
        return this.preçobase * diarias;

    }

}
