public class Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println(numero01 + numero02);
        System.out.println(numero01 - numero02);
        System.out.println(numero01 / (double)numero02);
        System.out.println(numero01 % numero02);
        System.out.println(numero01 * numero02);

        System.out.println("");

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        System.out.println("");

        // < > <= >= == !=
        boolean resultado1 = 10 > 20;
        boolean resultado2 = 10 < 20;
        boolean resultado3 = 10 == 20;
        boolean resultado4 = 10 != 20;
        boolean resultado5 = 20 >= 20;
        boolean resultado6 = 20 <= 20;

        System.out.println("Maior? " + resultado1);
        System.out.println("Menor? " + resultado2);
        System.out.println("Igual? " + resultado3);
        System.out.println("Diferente? " + resultado4);
        System.out.println("Maior ou igual? " + resultado5);
        System.out.println("Menor ou igual? " + resultado6);

        System.out.println("");

        // && (AND)     || (OR)       ! (NOT)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("Está dentro da e é maior que trinta? " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("Está dentro da e é menor que trinta? " + isDentroDaLeiMenorQueTrinta);

        System.out.println("");

        double valorContaCorrente = 200;
        double valorContaPoupanca = 10000;
        float valorPS5 = 5000;

        boolean possivelComprarPS5 = valorContaCorrente > valorPS5 || valorContaPoupanca > valorPS5;
        System.out.println("É possível comprar o PS5? " +  possivelComprarPS5);

        System.out.println("");

        //   =     +=    -=     *=     /=     %=
        double bonus = 1800;
        System.out.println("Bonus: " + bonus); // 1800
        bonus += 1000;
        System.out.println("Bonus: " + bonus); // 2800
        bonus -= 300;
        System.out.println("Bonus: " + bonus); // 2500
        bonus *= 2;
        System.out.println("Bonus: " + bonus); // 5000

        System.out.println("");

        int contador = 0;
        int contador2 = 0;

        contador++;
        System.out.println("Contador: " + contador);
        contador--;
        System.out.println("Contador: " + contador);
        ++contador2;
        System.out.println("Contador: " + contador);
        --contador2;
        System.out.println("Contador: " + contador);
    }
}
