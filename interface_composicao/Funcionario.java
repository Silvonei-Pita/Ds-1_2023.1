
package interface_composicao;

import java.time.LocalDate;
import java.time.Period;


public abstract class Funcionario implements SalarioFinal{
    
    //Atributos
    protected String nome;
    protected LocalDate dataNascimento;
    protected Genero genero;
    protected Setor setor;
    protected double salarioBase;
    
    //Construtor
    public Funcionario(String nome, LocalDate dataNascimento, Genero genero, Setor setor, double salarioBase) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.setor = setor;
        this.salarioBase = salarioBase;
    }
    
    //toString
    @Override
    public String toString() {
        return "Funcionario" + 
               "\nnome: " + nome + 
               "\nData de Nascimento: " + Util.formatarData(dataNascimento) + 
               "\nIdade: " + getIdade() +
               "\nGênero: " + genero.getCaractere() + 
               "\nSetor: " + setor.getNome() +
               "\nSalário Base: " + Util.formatarMonetario(salarioBase)+
               "\nSalário Final: " + Util.formatarMonetario(getSalarioFinal());
    }
    

    
    //Getters and Setters
        //getIdade
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
    
    
    
    
}
