
package interface_composicao;

import java.time.LocalDate;


public class Motoboy extends Funcionario{
    //atributos
    private String carteiraDeHabilitacao;

    //Construtor
    public Motoboy(String carteiraDeHabilitacao, String nome, LocalDate dataNascimento, Genero genero, Setor setor, double salarioBase) {
        super(nome, dataNascimento, genero, setor, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() +
               "\nMotoboy" + 
               "\nCarteira de Habilitação: " + carteiraDeHabilitacao;
    }
    
    
    //método abstrato
    @Override
    public double getSalarioFinal() {
        return salarioBase; 
   }
    
    
    //Getters and Setters
    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }
    
    
    
    
}
