public class Pessoa {

    private String nome;
    private String Endereco endereco;



    public Pessoa(String nome, String endereco) {
        setNome(nome);
        setEndereco(endereco);
    }



    public String getNome() {
        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome inválido.");
        }
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        if (endereco == null || nome.isBlank()){
            throw new IllegalArgumentException("Endereço inválido.");
        }
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
