
package interface_composicao;

import java.time.LocalDate;
import java.time.Month;


public class Main {
    public static void main(String[] args) {
        
        Diretor diretor = new Diretor("Manuel", LocalDate.of(2000, Month.MARCH, 15), Genero.MASCULINO, Setor.FINANCEIRO, 5000.50);
        Motoboy motoboy1 = new Motoboy("12123234245", "Ana", LocalDate.of(1990, Month.JUNE, 26), Genero.FEMININO, Setor.OPERACOES, 3000.2);
        
        
        System.out.println(diretor.toString());
        System.out.println("");
        diretor.admitir(motoboy1);
        System.out.println("");
      
        
        
        
    }
    
}
