public class Exercicio02EstruturasCondicionais_05 {
    public static void main(String[] args) {
        byte dia = 1;
//    switch (dia) {
//        case 1:
//        case 7:
//            System.out.println("Fim de semana");
//            break;
//        case 2:
//        case 3:
//        case 4:
//        case 5:
//        case 6:
//            System.out.println("Dia de semana");
//            break;
//        }
        switch (dia) {
            case 1, 7 -> System.out.println("Fim de semana");
            case 2, 3, 4, 5, 6 -> System.out.println("Dia útil");
            default -> throw new IllegalArgumentException("Unexpected value: " + dia);
        }
    }
}