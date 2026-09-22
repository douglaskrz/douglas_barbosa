public class exer08_poo {
    public static void main(String[] args) {

        contribuintes pessoa1 = new contribuintes("João da Silva", "111.111.111.11", "RS", 3500, 0);
        contribuintes pessoa2 = new contribuintes("Douglas", "222.222.222.22", "SC", 500000, 0);
        contribuintes pessoa3 = new contribuintes("Matheus","333.333.333.33", "PR", 7000, 0);
        contribuintes pessoa4 = new contribuintes("Maria", "444.444.444.44", "SP", 24000, 0);
        contribuintes pessoa5 = new contribuintes("Luiza", "555.555.555.55", "ES", 34000, 0);

       contribuintes[] contribuintes = { pessoa1, pessoa2, pessoa3, pessoa4, pessoa5};

        double maiorImposto = 0;
        contribuintes contribuintesMaisPagaImposto = null;

        for (int i = 0; i < contribuintes.length; i++) {
            if (contribuintes[i].calcularImposto() > maiorImposto) {
                maiorImposto = contribuintes[i].calcularImposto();
                contribuintesMaisPagaImposto = contribuintes[i];
            }
        }
        System.out.println(contribuintesMaisPagaImposto);


        double totalImposto = 0;

        for (int i = 0; i < contribuintes.length; i++) {
            totalImposto += contribuintes[i].calcularImposto();
        }
        System.out.println("O total do imposto é: "+totalImposto);


    }
}
