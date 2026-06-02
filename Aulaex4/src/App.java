public class App {
    public static void main(String[] args) throws Exception {
        Televisao tv = new Televisao();
        LampadaRGB lampada = new LampadaRGB();

        tv.ligar();
        lampada.desligar();

        tv.desligar();
        lampada.ligar();
    }
}
