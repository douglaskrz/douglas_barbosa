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

    public double calcularImposto(){
        return rendaAnual * calcularAliquota();
    }



    private double calcularAliquota(){// 0 a 4.000
        if (rendaAnual<4000) {
            return 0;
        }
        else if (rendaAnual <= 9000) {
            return 0.058;
        }
        else if ( rendaAnual <= 25000) {
            return 0.15;
        }
        else if (rendaAnual <= 35000) {
            return 0.275;
        }
        return 0.3;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()){
            System.out.println("Erro, nome inválido.");
        }else {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isBlank() || cpf.length() != 11){
            System.out.println("Erro, CPF inválido.");
        }else {
            this.cpf = cpf;
        }
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if (uf == null || uf.isBlank() || uf.length() != 2){
            System.out.println("Erro, UF inválido.");
        }else {
            this.uf = uf;
        }
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        if (rendaAnual < 0){
            System.out.println("Erro, renda anual inválida.");
        }else {
            this.rendaAnual = rendaAnual;
        }
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }



    @Override
    public String toString() {
        return "contribuintes{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", uf='" + uf + '\'' +
                ", rendaAnual=" + rendaAnual +
                ", imposto=" + imposto +
                '}';
    }
}
