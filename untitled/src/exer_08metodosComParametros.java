import java.util.Scanner;

public class exer_08metodosComParametros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Informe a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = mediaAritmetica(nota1, nota2, nota3);
        System.out.println("A média é: " + media);
        // ou System.out.println(mediaAritmetica(nota1, nota2, nota3));



        sc.close();
    }
    public static double mediaAritmetica(double notaUM, double notaDOIS, double notaTRES) {

        if (notaUM < 0 || notaUM > 10 || notaDOIS < 0 || notaDOIS > 10 || notaTRES < 0 || notaTRES > 10) {
            return 0;
        }
        return (notaUM + notaDOIS + notaTRES)/3;

    }
