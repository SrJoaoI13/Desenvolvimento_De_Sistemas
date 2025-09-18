package org.example;

public class Endereco {
    private String logadouro;
    private String numero;
    private String complemento;
    private String cep;
    private String cidade;
    private UF uf;

    public Endereco(String logadouro, String numero, String complemento, String cep, String cidade, UF uf) {
        this.logadouro = logadouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UF getUf() {
        return uf;
    }

    public void setUf(UF uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Logadouro: '" + logadouro + '\'' +
                ", Numero: '" + numero + '\'' +
                ", Complemento: '" + complemento + '\'' +
                ", Cep: '" + cep + '\'' +
                ", Cidade: '" + cidade + '\'' +
                ", UF: " + uf.getSigla() +
                '}';
    }
}
