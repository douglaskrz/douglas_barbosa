import java.util.Scanner;

public class exer06_metodosComParametros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Informe o sobrenome de solteira de sua mãe: ");
        String sobrenomeMae = sc.nextLine();

        System.out.println("Informe o nome da cidade em que você nasceu: ");
        String cidade = sc.nextLine();

        System.out.println(nomeStarWars(sobrenome, nome));
        System.out.println(sobrenomeStarWars(sobrenomeMae, cidade));


        sc.close();
    }
    public static String nomeStarWars (String sobrenome, String nome){

        String sobrenome_ = sobrenome.substring(3);
        String nome_ = nome.substring(2);
        String soma01 = sobrenome_+nome_;

        return soma01;
    }

    public static String sobrenomeStarWars (String sobrenomeMae, String cidade){

        String sobrenomeMae_ = sobrenomeMae.substring(2);
        String cidade_ = cidade.substring(3);
        String soma02 = sobrenomeMae_+cidade_;

       return soma02;
    }

}
