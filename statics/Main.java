
package statics;

import java.time.LocalDate;
import java.time.Month;


public class Main {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Álef", LocalDate.of(2000, Month.MARCH, 10), 2000.32);
        System.out.println("");
        System.out.println(pessoa.toString());
        
    }
    
}
