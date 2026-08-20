import java.util.Scanner;

public class exer07_metodosComParametros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Verão\n2 - Inverno\n3 - Outono\n4 - Primavera\nInforme um número:");
        int numero = sc.nextInt();

        if(numero==1){
            System.out.println(verao());
        }else if(numero==2){
            System.out.println(inverno());
        } else if(numero==3){
            System.out.println(primavera());
        }   else if (numero==4){
            System.out.println(outono());
        }

        sc.close();
    }
    public static String verao(){
        return "É verão.";
    }
    public static String inverno(){
        return "É inverno.";
    }
    public static String primavera(){
        return "É primavera.";
    }
    public static String outono(){
        return "É outono.";
    }

}
