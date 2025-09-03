package exercicio2;

public class Dispositivo_Armazenamento extends MeM{
    private String CapaArmazenamento;
    private String TipoConexao;

    public Dispositivo_Armazenamento(String marca, String modelo, String capaArmazenamento, String tipoConexao) {
        super(marca, modelo);
        CapaArmazenamento = capaArmazenamento;
        TipoConexao = tipoConexao;
    }

    public String getCapaArmazenamento() {
        return CapaArmazenamento;
    }

    public void setCapaArmazenamento(String capaArmazenamento) {
        CapaArmazenamento = capaArmazenamento;
    }

    public String getTipoConexao() {
        return TipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        TipoConexao = tipoConexao;
    }

    @Override
    public String toString() {
        return "Dispositivo_Armazenamento{" +
                "CapaArmazenamento='" + CapaArmazenamento + '\'' +
                ", TipoConexao='" + TipoConexao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
