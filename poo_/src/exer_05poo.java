public class exer_05poo {

    public static void main(String[] args) {

        identificacaoFuncionario iF = new identificacaoFuncionario();
        iF.identificacao = "abc123";
        iF.nome = "Douglas";
        iF.sobrenome = "Barbosa";
        iF.salario = 4000;

        System.out.println("Identificação do funcionário: "+iF.identificacao);
        System.out.println("Nome: ");
        System.out.println("Salário anual: R$"+iF.salarioAnual());

    }

}
