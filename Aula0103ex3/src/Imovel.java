
public class Imovel implements Tributavel {

    protected double ValorVenal;
    
    public Imovel(double ValorVenal) {
        this.ValorVenal = ValorVenal;
    }

    @Override

    public double CalcularImposto() {
        return this.ValorVenal / 100;
    }


}
