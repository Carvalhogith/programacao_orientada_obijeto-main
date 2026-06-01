public class PagamentoCartao extends Pagamento {
    public PagamentoCartao(double valor) {
        super(valor);
    }
    @Override
    public void  processarPagamento() {
        System.out.println("Enviando dados para o cartao");
    }
}
