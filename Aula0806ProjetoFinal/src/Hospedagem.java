
public class Hospedagem {

    protected Quarto quarto;
    protected Cliente hospede;
    protected int diarias;
    protected boolean isAtiva;
    protected double ValorTotal;

    public Hospedagem(Quarto quarto, Cliente hospede, int diarias) {
        this.quarto = quarto;
        this.hospede = hospede;
        this.diarias = diarias;
        this.isAtiva = true;
        this.ValorTotal = 0.0;
    }

    public Quarto getQuarto() {
        return this.quarto;
    }

    public Cliente getHospede() {
        return this.hospede;
    }

    public boolean getIsAtiva() {
        return this.isAtiva;

    }

    public int getDiarias() {
        return this.diarias;
    }

    public double getValorTotal() {
        return this.ValorTotal;
    }

    public void setIsAtiva(boolean Status) {
        this.isAtiva = Status;
    }

    public void setValorTotal(double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

}
