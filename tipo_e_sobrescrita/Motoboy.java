
package tipo_e_sobrescrita;

import java.time.LocalDate;


public class Motoboy extends Funcionario{

    //Atributos
    private String placaDaMoto;

    //Construtor
    public Motoboy(String placaDaMoto, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    } 

    //toString
    @Override
    public String toString() {
        return super.toString() +
               "\nMotoboy" + 
               "\nPlaca da Moto: " + placaDaMoto;
    }

    //Método abstrato
    @Override
    public double getSalarioFinal() {
        return salarioBase;
    }

    //Getters e Setters
    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    
    
    
    
}
