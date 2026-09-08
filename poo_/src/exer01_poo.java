public class exer01_poo {
    public static void main(String[] args) {

        usuario informacoes_01 = new usuario();

        informacoes_01.nome = "Douglas";
        informacoes_01.data = "01/01/2000";
        informacoes_01.sexo = 'm' ;
        informacoes_01.estadoCivil = "solteiro";

        usuario informacoes_02 = new usuario();

        informacoes_02.nome = "DOUGLAS";
        informacoes_02.data = "02/03/2000";
        informacoes_02.sexo = 'm' ;
        informacoes_02.estadoCivil = "SOLTEIRO";

        System.out.println("Nome: " + informacoes_01.nome);
        System.out.println("Data de nascimento: " + informacoes_01.data);
        System.out.println("Sexo: " + informacoes_01.sexo);
        System.out.println("Estado Civil: " + informacoes_01.estadoCivil);

        System.out.println("Nome: " + informacoes_02.nome);
        System.out.println("Data de nascimento: " + informacoes_02.data);
        System.out.println("Sexo: " + informacoes_02.sexo);
        System.out.println("Estado Civil: " + informacoes_02.estadoCivil);

    }
}
