
package atividadeHerance4;

import java.time.LocalDate;


public class Motoboy extends Funcionario {
    
    private String placaDaMoto;

    public Motoboy(String placaDaMoto, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public String toString() {
        return super.toString() + 
               "Motoboy: " + 
               "\nPlaca da Moto: " + placaDaMoto;
    }
    
   
    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public double getSalarioFinal() {
        return salarioBase;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
