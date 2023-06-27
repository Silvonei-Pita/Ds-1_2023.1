
package interface_revisao;

import java.time.LocalDate;


public class Cliente extends Fisica{
    
    //Atributos
    private int protocoloAtendimento;

    //Construtor
    public Cliente(int protocoloAtendimento, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() +
                "Cliente" + 
                "\nProtocolo de Atendimento: " + protocoloAtendimento;
    }

    //Getters and Setters
    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }
    
    
    
}
