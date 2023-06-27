
package interface_revisao;

import java.time.LocalDate;


public class Medico extends Funcionario{
    
    //Atributos
    private String crm;

    //Construtor
    public Medico(String crm, String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.crm = crm;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() +
               "Medico " + 
               "\nCRM: " + crm;
    }
    
    //Método Abstrato
    @Override
    public double getSalarioFinal() {
        return super.salario;
    }
    
    
    //Getters and Setters
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }


    
    
    
}
