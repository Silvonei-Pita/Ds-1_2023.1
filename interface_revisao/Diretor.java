
package interface_revisao;

import java.time.LocalDate;


public class Diretor extends Funcionario implements Contratacao{
    
    //Atributos
    private double PREMIO = 0.2;

    //Construtor
    public Diretor(String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
    }

    @Override
    public String toString() {
        return super.toString() +
               "Diretor " + 
               "Prêmio: " + (PREMIO * 100) + "%";
    }
    
    

    //Métodos 
    @Override
    public double getSalarioFinal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void admitir(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void demitir(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Getters
    public double getPREMIO() {
        return PREMIO;
    }
    
   

    
    
    
}
