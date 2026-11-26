public class Exercicio03EstruturasCondicionais_05 {
    public static void main(String[] args) {
        byte codigoMeioPagamento = 3;
        String formaPagamento = "";
        double valorVenda = 500;
        double descontoDinheiro = 10.00 / 100.0;
        double descontoPixETaxaCredito = 5.00 / 100.0;
        double valorDesconto;
        double valorComDesconto = 0;
        boolean pagamentoValido = true;

        //considerando 1 - dinheiro 10%, 2 - pix %5 , 3 - debito(nao tem desconto), 4 - credito 5%
        switch (codigoMeioPagamento) {
            case 1:
                formaPagamento = "Dinheiro";
                valorDesconto = valorVenda * descontoDinheiro;
                valorComDesconto = valorVenda - valorDesconto;
                break;
            case 2:
                formaPagamento = "PIX";
                valorDesconto = valorVenda * descontoPixETaxaCredito;
                valorComDesconto = valorVenda - valorDesconto;
                break;
            case 3:
                formaPagamento = "Débito";
                valorComDesconto = valorVenda;
                break;
            case 4:
                formaPagamento = "Crédito";
                valorDesconto = valorVenda * descontoPixETaxaCredito;
                valorComDesconto = valorVenda + valorDesconto;
                break;
            default:
                pagamentoValido = false;
                break;
        }

        if (pagamentoValido) {
            System.out.println("======== PAGAMENTO ========");
            System.out.println("Valor original: " + valorVenda);
            System.out.println("Forma de pagamento: " + formaPagamento);
            System.out.println("Valor final: " + valorComDesconto);
            System.out.println("===========================");
        }else{
            System.out.println("Pagamento INVALIDO");
        }
    }
}