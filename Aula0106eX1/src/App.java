public class App {
    public static void main(String[] args) throws Exception {
        vendedor v1 = new vendedor("Rogério", 2000.0);
        vendedor v2 = new vendedor("Almir", 1700.0);
        Gerente g1 = new Gerente("Ramos", 4000.0);

        System.out.println("salario v1: " + v1.calcularSalario());
        System.out.println("salario v2: " + v2.calcularSalario());
        System.out.println("salario g1: " + g1.calcularSalario());
    }
}
