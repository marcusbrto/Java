public class Exercicio01EstruturasCondicionais_05 {
    public static void main(String[] args) {

        double salarioAnual = 40000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        // Identifica a faixa de tributação
        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }

        // Calcula o salário líquido
        double salarioLiquido = salarioAnual - valorImposto;

        System.out.println("Salário bruto: " + salarioAnual);
        System.out.println("Imposto: " + valorImposto);
        System.out.println("Salário líquido: " + salarioLiquido);
    }
}