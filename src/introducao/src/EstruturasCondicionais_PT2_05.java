public class EstruturasCondicionais_PT2_05 {
    public static void main(String[] args) {
        int idade = 19;

        if(idade < 15){
            System.out.println("Infantil");
        } else if (idade >= 15 && idade < 18){
            System.out.println("Adolescente");
        } else if (idade < 30) {
            System.out.println("Adulto jovem");
        } else if (idade < 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
}
