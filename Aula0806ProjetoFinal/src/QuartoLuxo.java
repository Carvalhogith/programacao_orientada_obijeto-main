
public class QuartoLuxo extends Quarto {
    public QuartoLuxo(int numero, double preçobase) {
        super(numero, preçobase);
    }

    @Override
    public double calcularTotal(int diarias) {
        return this.preçobase * diarias * 1.20;

    }

}
