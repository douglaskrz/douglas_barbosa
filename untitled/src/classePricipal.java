import java.util.Scanner;

public class classePricipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Veiculo v1 = new Veiculo();

        v1.marca = "Honda";
        v1.modelo = "Civic";
        v1.placa = "xxx1xx11";
        v1.ano = 2010;
        v1.preco = 50000;

        veiculoOpala vO = new veiculoOpala();

        vO.marcA = "Chevrolet";
        vO.modelO = "Opala";
        vO.ano = 1990;
        vO.placA = "12345";
        vO.preco = 60000;

        exer_01_poo ex1 = new exer_01_poo();

        ex1.nome = "Douglas";
        ex1.data = "01/01/2001";
        ex1.genero = 'M';
        ex1.estadoCivil = "solteiro";

        exer_01_poo ex01 = new exer_01_poo();

        ex01.nOME = "dOUGLAS";
        ex01.dATA = "02/02/2002";
        ex01.gENERO = 'm';
        ex01.eSTADOCIVIL = "casado";


        System.out.println("Nome: " + ex1.nome + "\nGênero: " + ex1.genero + "\nData de nascimento: " + ex1.data + "\nEstado civil: " + ex1.estadoCivil);
        System.out.println("Nome: " + ex1.nOME + "\nGênero: " + ex1.gENERO + "\nData de nascimento: " + ex1.dATA + "\nEstado civil: " + ex01.eSTADOCIVIL);


        sc.close();
    }
}
