public class SwitchExercise {
public static void main(String[] args) {
    // imprima o dia da semana considerando 1 como domingo
    int dia = 7;
    switch (dia){
        case 1:
            System.out.println("Domingo");
            break;
            case 2:
            System.out.println("Segunda");
            break;
            case 3:
            System.out.println("Terça");
            break;
            case 4:
            System.out.println("Quarta");
            break;
            case 5:
            System.out.println("Quinta");
            break;
            case 6:
            System.out.println("Sexta");
            break;
            case 7:
            System.out.println("Sábado");
            break;
            default:
                System.out.println("Opção inválida");
                break;
    }

    String sexo = "M";
    switch (sexo) {
        case "H":
            System.out.println("Homem");
            break;
        case "M":
            System.out.println("Mulher");
        default:
            System.out.println("Inválido");
            break;
    }
}
}
