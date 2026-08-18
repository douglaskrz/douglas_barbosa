import java.util.Scanner;

public class exer01_metodoParametro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero: ");
        numero(sc.nextDouble());

        sc.close();

    }
   public static void numero (double num){


            System.out.println(num+"\n");


        }
   }
