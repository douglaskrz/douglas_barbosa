import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicioArrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Double> numeros = new ArrayList<Double>();

        numeros.add(10.0);
        numeros.add(78.0);
        numeros.add(44.0);
        numeros.add(97.0);
        numeros.add(33.0);
        numeros.add(22.0);

        System.out.println("Informe um número: ");
        double numero = sc.nextDouble();

        double indice = numeros.indexOf(numero);

        if (indice != -1 ){
            System.out.println(indice);
        } else {
            System.out.println("Não está na lista.");
        }

        sc.close();
    }
}
