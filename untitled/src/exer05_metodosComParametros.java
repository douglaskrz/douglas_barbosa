import java.util.Scanner;

public class exer05_metodosComParametros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor da base: ");
        int base = sc.nextInt();

        System.out.println("Insira o número 1: ");
        int num1 = sc.nextInt();

        System.out.println("Insira o  número 2: ");
        int num2 = sc.nextInt();

        obterNumeroPertoBase(base, num1, num2);

        sc.close();
    }

    public static void obterNumeroPertoBase(int base, int num1, int num2){

        int distanciaBase1 = Math.abs(num1 - base) ;
        int distanciaBase2 = Math.abs(num2 - base);

        if (distanciaBase1 < distanciaBase2){
            System.out.println("O número mais perto é: "+num1);
        } else if (distanciaBase2<distanciaBase1) {
            System.out.println("O número mais perto é: "+num2);

        }
    }

}
