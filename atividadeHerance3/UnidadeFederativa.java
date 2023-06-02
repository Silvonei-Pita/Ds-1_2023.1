
package atividadeHerance3;

public enum UnidadeFederativa {
    BAHIA("BA", "Bahia"),
    SAO_PAULO("SP", "São Paulo"),
    RIO_DE_JANEIRO("RJ", "Rio de Janeiro");
    
    private final String sigla;
    private final String nome;

    private UnidadeFederativa(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    
    
    
    
    
}
