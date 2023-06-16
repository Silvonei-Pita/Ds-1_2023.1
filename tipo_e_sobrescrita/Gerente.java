
package tipo_e_sobrescrita;

import java.time.LocalDate;

public class Gerente extends CargoDeConfianca implements Autenticavel{
    
    //Construtor
    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao);
    }
    
    //toString

    @Override
    public String toString() {
        return super.toString() +
                "\nGerente";
    }

    //Método Abstrato
    @Override
    public double getSalarioFinal() {
        return salarioBase + salarioBase * Bonificacao.GERENTE.getValor();
    }
    
    
    
}
