
package interface_composicao;

import java.time.LocalDate;


public class Diretor extends Funcionario implements Contratacao{
    //Atributos
    private final double PREMIO = 0.2;

    
    //Construtor
    public Diretor(String nome, LocalDate dataNascimento, Genero genero, Setor setor, double salarioBase) {
        super(nome, dataNascimento, genero, setor, salarioBase);
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() +
               "\nDiretor " + 
               "\nPrêmio: " + PREMIO;
    }
    

    //método abstrato
    @Override
    public double getSalarioFinal() {
        double salario_final = salarioBase;
        salario_final += salario_final * PREMIO;
        return salario_final;
    }
    
    //E se eu tentar criar o objeto motoboy nessa parte aqui?
    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println(funcionario.nome + " Admitido. " + "Setor: " + funcionario.setor.getNome());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        
    }
 

    //Getters
    public double getPREMIO() {
        return PREMIO;
    }

    



   
    
    

    

    
    
    
    
}
