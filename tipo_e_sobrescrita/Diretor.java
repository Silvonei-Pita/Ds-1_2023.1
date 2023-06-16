
package tipo_e_sobrescrita;

import java.time.LocalDate;


public class Diretor extends CargoDeConfianca implements Autenticavel{
    
    //Atributos
    private final double PREMIO = 0.1;

    //Construtor
    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao);
    }
    
    //toString

    @Override
    public String toString() {
        return super.toString() +
                "\nDiretor " + 
                "\nPrêmio: " + PREMIO;
    }
    
    
    
    //Método Abstrato
    @Override
    public double getSalarioFinal() {
        return salarioBase + salarioBase * PREMIO + salarioBase * Bonificacao.GERENTE.getValor();
    }
    
    //Getters and Setters
    public double getPREMIO() {
        return PREMIO;
    }

    
    
    
    
    
    
}
