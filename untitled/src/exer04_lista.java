import java.util.Scanner;

public class exer04_lista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inscricao;
        int qtdAtltas = 0;
        int inscMaisAlto = 0, inscMaisBaixo = 0;
        double altura, alturaMaisAlto = 0, alturaMaisBaixo = 0;
        double somaAlturas = 0;

        while(true) {
            System.out.println("Informe o numero de inscrição(Digite 0 para sair): ");
            inscricao = sc.nextInt();

            if(inscricao==0) {
                break;
            }
            System.out.println("Informe a altura: ");
            altura = sc.nextDouble();

            if(qtdAtltas == 0)
            {
                alturaMaisAlto = altura;
                inscMaisAlto = inscricao;
                alturaMaisBaixo= altura;
                inscMaisBaixo = inscricao;

            }
            else{
                if (altura>alturaMaisAlto)
                {
                    alturaMaisAlto = altura;
                    inscMaisAlto = inscricao;
                }
                if (altura<alturaMaisBaixo)
                {
                    alturaMaisBaixo = altura;
                    inscMaisBaixo = inscricao;
                }
            }
            somaAlturas += altura;
            qtdAtltas++;

        }

        if (qtdAtltas>0) {
            double mediaAlturas = somaAlturas / qtdAtltas;

            System.out.println("/n====== Resultado ======");
            System.out.println("Total de atletas cadastrados: "+qtdAtltas);
            System.out.println("Atleta mais alto: Inscrição #"+inscMaisAlto+" | Altura: "+alturaMaisAlto+"/n");
            System.out.println("Atleta mais baixo: Inscrição #"+inscMaisBaixo+"| Altura: "+alturaMaisBaixo+"/n");
            System.out.println("Altura média dos atletas: %.2fm\n"+ mediaAlturas);
        }else {
            System.out.println("/nNenhum atleta foi cadastrado.");
        }

        sc.close();
    }
}
