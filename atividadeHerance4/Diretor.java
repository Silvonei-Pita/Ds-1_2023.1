
package atividadeHerance4;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca {
    
    private double premio = 0.1;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Diretor{" + "premio=" + premio + '}';
    }
    
    

    @Override
    public double getSalarioFinal() {
        return salarioBase + salarioBase * Bonificacao.DIRETOR.valor + salarioBase * Bonificacao.GERENTE.valor;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
