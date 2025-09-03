package org.example;

public enum UF {
    BAHIA("Bahia/"+ "BA"),
    SÃO_PAULO("São Paulo/"+ "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro/"+ "RJ"),
    MINAS_GERAIS("Minas Gerais/"+ "MG"),
    ESPIRITO_SANTO("Espírito Santo/"+ "ES"),
    RIO_GRANDE_DO_SUL("Rio Grande do Sul/"+ "RS"),
    PARANA("Paraná/"+ "PR"),
    PERNAMBUCO("Pernambuco/"+ "PE"),
    CEARA("Ceará/"+ "CE"),
    GOIAS("Goiás/"+ "GO"),
    AMAZONAS("Amazonas/"+ "AM"),
    PARAIBA("Paraíba/" +"PB");

    private String sigla;

    UF(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }
}
