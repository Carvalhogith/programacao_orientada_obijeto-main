public class vendedor extends Funcionario {
    public vendedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    @Override
    public  double calcularSalario() {
        return this.salarioBase + 500;
    }
}
