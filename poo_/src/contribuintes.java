public class contribuintes {

   private String nome;
   private String cpf;
   private String uf;
   private double rendaAnual;
   private double imposto;



    public contribuintes(String nome, String cpf,  String uf, double rendaAnual, double imposto) {
        setNome(nome);
        setCpf(cpf);
        setUf(uf);
        setRendaAnual(rendaAnual);
        setImposto(imposto);
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()){
            System.out.println("Erro, nome inválido.");
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isBlank()){
            System.out.println("Erro, CPF inválido.");
        }
        this.cpf = cpf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if (uf == null || uf.isBlank()){
            System.out.println("Erro, UF inválido.");
        }
        this.uf = uf;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        if (rendaAnual < 0){
            System.out.println("Erro, renda anual inválida.");
        }
        this.rendaAnual = rendaAnual;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }



    public double imposto1(double rendaAnual){ // 0 a 4.000
            return rendaAnual*0;
    }
    public double imposto2(double rendaAnual){ // 4.001 a 9.000
            return rendaAnual*((rendaAnual*5.8)/100);
    }
    public double imposto3(double rendaAnual){ // 9.001 a 25.000
        return rendaAnual*((rendaAnual*15)/100);
    }
    public double imposto4(double rendaAnual){ //25.001 a 35.000
        return rendaAnual*((rendaAnual*27.5)/100);
    }
    public double imposto5(double rendaAnual){ // acima de 35.000
        return rendaAnual*((rendaAnual*30)/100);
    }

}
