
package atividadeHerance5;

import java.time.LocalDate;


public class Cliente extends Fisica {
    
    private int protocoloAtendimento;

    public Cliente(int protocoloAtendimento, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(genero, estadoCivil, dataNascimento, id, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nCliente: " + 
               "\nProtocolo de Atendimento: " + protocoloAtendimento;
    }
    
    

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }
    
    
    
 
    
}
