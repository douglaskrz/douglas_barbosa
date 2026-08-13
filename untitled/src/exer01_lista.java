import java.util.Scanner;

public class exer01_lista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número de matrícula: ");
        String numeroMatricula = sc.next();

        System.out.println("Informe o nome: ");
        String nome = sc.next();

        System.out.println("Informe as horas trabalhadas na semana: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.println("Informe o valor que recebe por hora: ");
        int pagamento = sc.nextInt();

        // calculo pagamento
        int pagamentoTotal = pagamento*horasTrabalhadas*4;

        System.out.println("Número de matrícula: "+numeroMatricula);
        System.out.println("Nome: "+nome);
        System.out.println("Salário: "+pagamentoTotal);



        sc.close();
    }
}
