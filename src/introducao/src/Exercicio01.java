public class Exercicio01 {
    public static void main(String[] args) {
        int idade = 20;
        boolean temCNH = true;
        boolean temCarro = true;

        if (idade >= 18 && temCarro == true && temCNH == true){
            System.out.println("Pode dirigir");
        }else if(idade < 18){
            System.out.println("Menor de idade");
        }else if(!temCNH){
            System.out.println("Você não pode dirigir sem carteira");
        }else if(!temCarro){
            System.out.println("Vai dirigir o que sem carro?");
        }
    }
}
