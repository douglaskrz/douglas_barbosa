import java.util.Scanner;

public class exer02_metodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        String nomeI = sc.next();

        System.out.println("Informe a idade: ");
        int idadeI = sc.nextInt();

        sc.close();

        nome();
        idade();
        funcao();

    }

    public static void nome(){
        System.out.println("O nome dele(a) é: ");
    }
    public static void idade(){
        System.out.println("Ele(a) tem  anos");
    }
    public static void funcao(){
        System.out.println("Ele(a) é estudante de desenvolvimento de sistemas");
    }
}
