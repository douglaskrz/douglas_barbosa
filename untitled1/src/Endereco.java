public class Endereco {

    private String UF;
    private String cidade;
    private String CEP;
    private String logradouro;
    private String numero;



    public Endereco(String UF, String cidade, String CEP, String logradouro, String numero) {
        setUF(UF);
        setCidade(cidade);
        setCEP(CEP);
        setLogradouro(logradouro);
        setNumero(numero);
    }



    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getCidade() {
        if (cidade == null || cidade.isBlank()){
            throw new IllegalArgumentException("Cidade inválida.");
        }
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCEP() {
        if (CEP == null || CEP.isBlank()){
            throw new IllegalArgumentException("CEP inválido.");
        }
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }



    @Override
    public String toString() {
        return "Endereco{" +
                "UF='" + UF + '\'' +
                ", cidade='" + cidade + '\'' +
                ", CEP='" + CEP + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numero=" + numero +
                '}';
    }
}
