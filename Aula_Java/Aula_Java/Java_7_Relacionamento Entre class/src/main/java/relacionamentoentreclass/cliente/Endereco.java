package cliente;

public class Endereco {
    private String Logradura;
    private String Numero;
    private String Cidade;

    public Endereco(String logradura, String numero, String cidade) {
        Logradura = logradura;
        Numero = numero;
        Cidade = cidade;
    }

    public String getLogradura() {
        return Logradura;
    }

    public void setLogradura(String logradura) {
        Logradura = logradura;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "Logradura='" + Logradura + '\'' +
                ", Numero='" + Numero + '\'' +
                ", Cidade='" + Cidade + '\'' +
                '}';
    }
}
