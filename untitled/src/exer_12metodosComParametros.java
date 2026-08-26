import java.util.Scanner;

public class exer_12metodosComParametros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a palavra: ");
        String palavra = sc.next();

        System.out.println(obterCaractere(palavra));

        sc.close();
    }

    public static char obterCaractere(String palavra) {
        if (palavra.length() % 2 == 0) {
            return palavra.charAt(0);
        }
        return palavra.charAt(1); // //return   palavra.length()%2==0 ? palavra.charAt(0) : palavra.charAt(1);

    }
}



