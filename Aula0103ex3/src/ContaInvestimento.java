
public class ContaInvestimento implements Tributavel {
    protected  double  saldo;

    public ContaInvestimento(double saldo) {
        this.saldo = saldo;
    }

    @Override

    public double CalcularImposto() {
        return this.saldo * 0.005;
    }

}
