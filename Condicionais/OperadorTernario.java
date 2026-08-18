public class OperadorTernario {
    public static void main(String[] args) {
        double salario = 600;
        String mensagemDoar = "Sim,doar";
        String mensagemNaoDoar = "Não doar";
//Operador ternário para encontrar se deve-se doar ou não
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar; 
        System.out.println(resultado);
    }
}
