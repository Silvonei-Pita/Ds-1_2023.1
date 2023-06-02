
package atividadeHerance4;

import java.time.LocalDate;


public class Gerente extends CargoDeConfianca {

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
    }

    @Override
    public String toString() {
        return super.toString() + 
                "Gerente{" + '}';
    }

    
    
    @Override
    public double getSalarioFinal() { 
        return salarioBase + salarioBase * Bonificacao.GERENTE.valor;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
    
}
