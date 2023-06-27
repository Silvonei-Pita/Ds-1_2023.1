
package interface_revisao;

import java.time.LocalDate;


public class Motoboy extends Funcionario{
    
    //Atributos
    private String carteiraDeHabilitacao;

    //Construtor
    public Motoboy(String carteiraDeHabilitacao, String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() +
                "Motoboy " +
                "\nCarteira de Habilitação: " + carteiraDeHabilitacao;
    }

    //Métodos Abstratos
    @Override
    public double getSalarioFinal() {
        return super.salario;
    }
    
    
    //Getters and Setters
    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    
    
    
    
}
