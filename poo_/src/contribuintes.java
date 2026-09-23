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
            throw new IllegalArgumentException("Nome inválido.");
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isBlank() || cpf.length() != 11){
            throw new IllegalArgumentException("Erro, CPF inválido.");
        }
            this.cpf = cpf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if (uf == null || uf.isBlank() || uf.length() != 2){
            throw new IllegalArgumentException("Erro, UF inválido.");
        }
            this.uf = uf;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        if (rendaAnual < 0){
            throw new IllegalArgumentException("Erro, renda anual inválida.");
        }
            this.rendaAnual = rendaAnual;
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
