
package tipo_e_sobrescrita;

import java.time.LocalDate;


public abstract class CargoDeConfianca extends Funcionario{
    
    //Atributos
    protected Bonificacao bonificacao;

    //Construtor
    public CargoDeConfianca(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao);
        this.bonificacao = bonificacao;
    }
    
    //toString

    @Override
    public String toString() {
        return super.toString() +
               "\nCargo de Confiança; Bonificação: " + bonificacao.getValor();
    }
    
    
    //Getters and Setters
    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
    
    
    
}
