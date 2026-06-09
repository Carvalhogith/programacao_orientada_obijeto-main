
public abstract class Quarto implements Financeiro {

    protected int numero;
    protected double preçobase;
    protected boolean isOcupado;

    public Quarto(int numero, double preçobase) {
        this.numero = numero;
        this.preçobase = preçobase;
        this.isOcupado = false;

    }

    public boolean getIsOcupado() {
        return this.isOcupado;

    }

    public void setIsOcupado(boolean Status) {
        this.isOcupado = Status;
    }

    public int getNumero() {
        return this.numero;
    }

    public double getpreçobase() {
        return this.preçobase;
    }

}
