public class Exercicio04 {
    public static void main(String[] args) {
        //Dados iniciais produto
        String nomeProduto = "Monitor Gamer";
        double precoUnitario = 100.00;
        int quantidadeProdutos = 1;
        boolean clienteVIP = true;
        double descontoVip = 5.00;

        //outros dados
        double valorRecebido = 50.00;
        double valorBruto = precoUnitario * quantidadeProdutos;
        double valorComDesconto;
        double valorDesconto;
        double porcetagemDesconto = 0.0;
        double troco;
        String statusPagamento;


        if(valorBruto >= 500){
            porcetagemDesconto = 15.0;
        }else if(valorBruto >= 300){
            porcetagemDesconto = 10.0;
        }else if(valorBruto >= 100){
            porcetagemDesconto = 5.0;
        }

        if(clienteVIP){
            porcetagemDesconto = porcetagemDesconto + 5.0;
        }

        valorDesconto = valorBruto * (porcetagemDesconto/100.0);
        valorComDesconto = valorBruto - valorDesconto;

        troco = valorRecebido - valorComDesconto;

        statusPagamento = (valorRecebido >= valorComDesconto)
                ? "Aprovado" : "Recusado";

        System.out.println("======= CUPOM DE VENDA ======");
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Preço unitário: " + precoUnitario);
        System.out.println("Quantidade: " + quantidadeProdutos);
        System.out.println("Cliente VIP: " + clienteVIP);
        System.out.println("");
        System.out.println("Valor bruto: " + valorBruto);
        if(clienteVIP){
            System.out.println("Desconto VIP: " + descontoVip);
        }
        System.out.println("Desconto total: " + porcetagemDesconto);
        System.out.println("Valor do desconto: " + valorDesconto);
        System.out.println("Valor líquido: " + valorComDesconto);
        System.out.println("");
        System.out.println("Valor recebido: " + valorRecebido);
        System.out.println("Status do pagamento: " + statusPagamento);
        if (valorRecebido >= valorComDesconto) {
            troco = valorRecebido - valorComDesconto;
            System.out.println("Troco: R$ " + troco);
        } else {
            double valorPendente = valorComDesconto - valorRecebido;
            System.out.println("Valor pendente: R$ " + valorPendente);
        }
    }
}
