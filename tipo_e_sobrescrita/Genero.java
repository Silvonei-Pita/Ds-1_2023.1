
package tipo_e_sobrescrita;


public enum Genero {
    MASCULINO("Masculino"),
    FEMININO("Feminino");
    
    private final String texto;

    private Genero(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
    
    
}
