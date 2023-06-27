
package interface_revisao;

import java.time.LocalDate;


public abstract class Funcionario extends Fisica implements SalarioFinal{
    
    //Atributos
    protected String cpf;
    protected String rg;
    protected String matricula;
    protected Setor setor;
    protected double salario;

    //Construtor
    public Funcionario(String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.setor = setor;
        this.salario = salario;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() +
               "Funcionario " + 
               "\nCPF: " + cpf + 
               "\nRG: " + rg + 
               "\nMatrícula: " + matricula + 
               "\nSetor: " + setor + 
               "\nSalário: " + salario;
    }
    
    
    //Getters and Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    
}
