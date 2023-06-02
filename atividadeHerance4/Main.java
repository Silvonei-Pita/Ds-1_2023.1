
package atividadeHerance4;

import java.time.LocalDate;
import java.time.Month;


public class Main {
    public static void main(String[] args) {
        
        Motoboy motoboy1 = new Motoboy("BRA2017", "Ricardo", "123.456.789-01", "98.765.432-10", Genero.MASCULINO, Setor.OPERACOES, 3000.25, LocalDate.of(2018, Month.MARCH, 15));
        Gerente gerente1 = new Gerente(Bonificacao.GERENTE, "Manuel", "237.135.954-12", "08.432.421-05", Genero.MASCULINO, Setor.ADMINISTRATIVO, 5000, LocalDate.of(2017, Month.DECEMBER, 10));
        Diretor diretor1 = new Diretor(Bonificacao.DIRETOR, "Letícia", "123.456.788-09", "21.360.721-29", Genero.FEMININO, Setor.SAUDE, 6000, LocalDate.of(2006, Month.MARCH, 20));
        
        System.out.println(motoboy1.toString());
        System.out.println("");
        System.out.println(gerente1.toString());
        System.out.println("");
        System.out.println(diretor1.toString());
        
        
    }
    
}
