package exercicio4;

public class Endereco {
    private String logradouro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;

    public Endereco(String logradouro, String cep, String numero, String complemento, String cidade) {
        this.logradouro = logradouro;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "logradouro='" + logradouro + '\'' +
                ", cep='" + cep + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
