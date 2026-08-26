import java.util.Scanner;

public class exer_10metodoComParametro {
    public class exer_10metodosComParametros {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Defina o limite máximo: ");
            double maximo = sc.nextDouble();

            System.out.println("Defina o limite mínimo: ");
            double minimo = sc.nextDouble();

            System.out.println("Informe o valor: ");
            double valor = sc.nextDouble();



            sc.close();
        }
        public static String limiteMetodo(double maximo, double minimo, double valor){

            if (valor>minimo && valor<maximo){
                return "Valor dentro do limite.";
            }
            return "Valor fora do limite.";

        }



    }
}
