import java.util.Scanner;

public class exer01_metodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Verão\n2 - Inverno\n3 - Outono\n4 - Primavera\nInforme um número:");
        int numero = sc.nextInt();

        if(numero==1){
            verao();
        }else if(numero==2){
            inverno();
        } else if(numero==3){
            primavera();
        }   else if (numero==4){
            outono();
        }

        sc.close();
    }
    public static void verao(){
        System.out.println("É verão\nE o tempo está quente");
    }
    public static void inverno(){
        System.out.println("É inverno\nE está frio");
    }
    public static void primavera(){
        System.out.println("É primavera\n");
    }
    public static void outono(){
        System.out.println("É outono\n ");
    }

}
