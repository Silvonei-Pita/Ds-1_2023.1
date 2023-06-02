
package atividadeHerance3;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    
    public static void main(String[] args) {
        
        Fisica pessoaFisica_1 = new Fisica(Genero.MASCULINO, "123.456.789-01", "12.345.657-32", LocalDate.of(2000, Month.JULY, 20), 2000.50, 1, "Silvio", "(71)94152-3459", 
                                new Endereco("Bonfim", "2", "Em frente ao CPM", "41997-680", "Salvador", UnidadeFederativa.BAHIA));
        Juridica pessoaJuridica_1 = new Juridica("123.456.789-1", "9876543210", LocalDate.of(1985, Month.MARCH, 10), LocalDate.of(2020, Month.MARCH, 10), 50000.50, 2, "Senai", "(71)98675-1243", 
        new Endereco("Bonfim", "10", "Em frente ao CPM", "981234-11", "Salvador", UnidadeFederativa.BAHIA));
        
        System.out.println(pessoaFisica_1.toString());
        System.out.println("");
        System.out.println(pessoaJuridica_1.toString());
        
        
        
   
        
    }
    
}
