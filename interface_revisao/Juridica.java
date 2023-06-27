
package interface_revisao;


public abstract class Juridica extends Pessoa{
    
    //Atributos
    protected String cnpj;
    protected String inscricaoEstadual;

    //Construtor
    public Juridica(String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() +
               "Juridica " + 
               "\nCNPJ: " + cnpj + 
               "\nInscriçãoEstadual: " + inscricaoEstadual;
    }
                                                                                                 
   
    
    //Getters and Setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    
    
    
    
}
