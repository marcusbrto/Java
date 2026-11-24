public class EstruturasCondicionais_PT3_05 {
    public static void main(String[] args) {
        double salario = 1220;

        String mensagemDoar = "Vou doar 500 reais para uma ONG!";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter depois!";
        String resultado = (salario > 500) ?  mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
