
package interface_revisao;

import java.time.LocalDate;

public class Engenheiro extends Funcionario{
    
    //Atributos
    private String crea;

    //Construtor
    public Engenheiro(String crea, String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.crea = crea;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() +
               "Engenheiro " + 
               "crea=" + crea;
    }
    
    //Método abstrato
    @Override
    public double getSalarioFinal() {
        return super.salario;
    }
    
    //Getters and Setters
    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }


    
    
    
    
}
