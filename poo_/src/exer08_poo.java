public class exer08_poo {
    public static void main(String[] args) {

        contribuintes pessoa1 = new contribuintes("João da Silva", "111.111.111.11", "RS", 3500, 0);
        contribuintes pessoa2 = new contribuintes("Douglas", "222.222.222.22", "SC", 500000, 0);
        contribuintes pessoa3 = new contribuintes("Matheus","333.333.333.33", "PR", 7000, 0);
        contribuintes pessoa4 = new contribuintes("Maria", "444.444.444.44", "SP", 24000, 0);
        contribuintes pessoa5 = new contribuintes("Luiza", "555.555.555.55", "ES", 34000, 0);

        //0 a 4.000 0%
        //4.001 a 9.000 5,8%
        //9.001 a 25.000 15%
        //25.001 a 35.000 27,5%
        //acima de 35.000 30%

        pessoa1.getImposto();
        pessoa2.getImposto();
        pessoa3.getImposto();
        pessoa4.getImposto();
        pessoa5.getImposto();


        double maisPagaImposto;
        contribuintes contribuintesMaisPagaImposto = null;

        for (int i = 0; i < 5; i++){

        }


    }
}
