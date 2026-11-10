public class exer05_RO {

    public static void main(String[] args) {

        Conta c1 = new Conta("Ana", 1000);
        Conta c2 = new Conta("Pedro", 500);

        c1.depositarValor(400);
        c2.sacarValor(500);

        System.out.println(c1);

        c1.transferirValor(500, c2);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c2.simularInvestimento(500, 10));
    }
}
