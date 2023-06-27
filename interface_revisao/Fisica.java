
package interface_revisao;

import java.time.LocalDate;
import java.time.Period;


public abstract class Fisica extends Pessoa{
    
    //Atributos
    protected Genero genero;
    protected EstadoCivil estadoCivil;
    protected LocalDate dataNascimento;

    //Construtor
    public Fisica(Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return super.toString() +
               "Fisica " + 
               "\nGênero: " + genero + 
               "\nEstado Civil: " + estadoCivil + 
               "\nData de Nascimento: " + dataNascimento;
    }
    
    
    
    
    //Métodos Novos
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    //Getters and Setters
    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    
    
}
