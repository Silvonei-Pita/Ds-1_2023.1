
package tipo_e_sobrescrita;

import java.time.LocalDate;
import java.time.Month;


public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("98454455367", "Bernardo", "342.742.123-86", "21.543.235-12", Genero.MASCULINO, 2500.50, LocalDate.of(2000, Month.MARCH, 10), LocalDate.of(2018, Month.APRIL, 25));
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Ana", "321.421.653-32", "32.621.345-43", Genero.FEMININO, 3000, LocalDate.of(1998, Month.JUNE, 20), LocalDate.of(2020, Month.MARCH, 10));
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Garibalda", "123.643.426-23", "42.123.453-13", Genero.FEMININO, 5000, LocalDate.of(1996, Month.DECEMBER, 25), LocalDate.of(2019, Month.MARCH, 30));
        
        System.out.println("Motoboy");
        System.out.println(motoboy.toString());
        System.out.println(Util.validar(motoboy));
        System.out.println("");
        System.out.println("Gerente");
        System.out.println(gerente.toString());
        System.out.println(Util.validar(gerente));
        System.out.println("");
        System.out.println("Diretor");
        System.out.println(diretor.toString());
        System.out.println(Util.validar(diretor));
        
       
        
        
        
        
        
        
    }
    
}
