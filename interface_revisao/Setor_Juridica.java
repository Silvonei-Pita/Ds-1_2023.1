
package interface_revisao;


public enum Setor_Juridica {
    
    TECNOLOGIA("Tecnologia"),
    MATERIAL_CONSTRUCAO("Material de Construção"),
    MATERIA_PRIMA("Matéria Prima"),
    ALIMENTICIO("Alimentício");
    
    private final String nome;

    private Setor_Juridica(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
    
}
