public class Exercicio03 {
    public static void main(String[] args) {
        String nomeProduto = "Teclado mecânico";
        int quantidadeProduto = 3;
        double valorBruto = 450.00;
        int porcetagemDesconto = 10;
        double valorRecebido = 500.00;

        double valorDesconto = valorBruto * (porcetagemDesconto / 100.0);
        double valorComDesconto = valorBruto - valorDesconto;

        System.out.println("Produto: " + nomeProduto);
        System.out.println("Quantidade: " + quantidadeProduto);
        System.out.println("Valor do produto: " + valorBruto);
        System.out.println("Valor da quantidade do produto: " + valorComDesconto);
        System.out.println("Valor recebido: " + valorRecebido);
        System.out.println("Troco: " + (valorRecebido - valorComDesconto));
    }
}
