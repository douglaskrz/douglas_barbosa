import java.util.Scanner;

public class exer_09metodosComParametro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o número: ");
        int numero = sc.nextInt();

        System.out.println(parOuImpar(numero));

    }
    public static boolean parOuImpar(int numero){
        if (numero%2==0){
            return true;
        } else{             // return numero %2 == 0;
            return false;
        }
    }

}
