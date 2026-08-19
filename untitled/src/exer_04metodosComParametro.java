public class exer_04metodosComParametro {

    public static void main(String[] args) {

        int vetor[] = {1, 2, 3, 4, 5};
        int vetor2[] = { 4, 2, 9, 10, 7, -5};

        obterMaiorValor(vetor);
        obterMenorValor(vetor);
        obterMedia(vetor);
    }

    public static void obterMaiorValor(int vetor[]){

        int maiorValor = Integer.MIN_VALUE;

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] > maiorValor){
                maiorValor = vetor[i];
            }
        }

        System.out.println("O maior valor é: "+maiorValor);
    }
    public static void obterMenorValor(int vetor[]){

        int menorValor = Integer.MAX_VALUE;

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < menorValor){
                menorValor = vetor[i];
            }
        }

        System.out.println("O menor valor é: "+menorValor);
    }
    public static void obterMedia(int vetor[]){

        double soma = 0;

        for(int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }

        double media = soma/ vetor.length;

        System.out.println("A média dos valores é: "+media);


    }


}
