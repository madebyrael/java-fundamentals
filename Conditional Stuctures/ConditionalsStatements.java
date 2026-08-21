public class ConditionalsStatements {
    public static void main(String[] args) {
        int idadeJogador = 19;

        if (idadeJogador < 15) {
            System.out.println("Você está na categoria infantil");
        } else if (idadeJogador >= 15 && idadeJogador < 18) {
            System.out.println("Você está na categoria juvenil");
        } else System.out.println("Você está na categoria adulto");
    }
}
