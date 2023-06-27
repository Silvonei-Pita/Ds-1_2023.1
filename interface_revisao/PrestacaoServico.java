
package interface_revisao;

import java.time.LocalDate;


public class PrestacaoServico extends Juridica{
    
    //Atributos
    private LocalDate contratoInicio;
    private LocalDate contratoFim;
    
    //Construtor
    public PrestacaoServico(LocalDate contratoInicio, LocalDate contratoFim, String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, nome, telefone, email, endereco);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() +
                "PrestacaoServico " + 
                "\nData de Início do Contrato: " + contratoInicio +
                "\nData de Fim do Contrato: " + contratoFim;
    }
    
    
    //Getters and Setters
    public LocalDate getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(LocalDate contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    public LocalDate getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(LocalDate contratoFim) {
        this.contratoFim = contratoFim;
    }
    
    
    
    
}
