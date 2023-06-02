
package atividadeHerance4;

import java.time.LocalDate;


public abstract class CargoDeConfianca extends Funcionario {
    
    protected Bonificacao bonificacao;

    public CargoDeConfianca(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
        this.bonificacao = bonificacao;
    }

    /*@Override
    public String toString() {
        return "* Cargo de Confiança *" + 
                "\nBonificação: " + bonificacao;
    } */
    
   
}
