import java.util.Scanner;

public class exer03_MetodosParametros {

    public static void imprimirNumero(double num){

        for(double i = num; i<num+20; i++){
            System.out.println(i);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        double numero = sc.nextDouble();

        imprimirNumero(numero);

        sc.close();
    }

}
