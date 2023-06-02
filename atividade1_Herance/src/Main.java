import java.time.LocalDate;
import java.time.Month;
import java.time.Period;



public class Main {
    public static void main(String[] args) {

        // Objeto pessoa_fisica
        Fisica pessoa_fisica = new Fisica("Eduardo",
                "(71)98841-7342",
                "071.891.053-92",
                "021.430.504-0", LocalDate.of(2004, Month.JUNE, 30));

        //Objeto pessoa jurídica
        Juridica nintendo = new Juridica("Nintendo",
                "(71)3384-0880",
                "08.070.570/000.1",
                "893047389");

        //Exibir dados

            //Pessoa Física
        System.out.println(pessoa_fisica.toString());
        System.out.println();
            //Pessoa Jurídica
        System.out.println(nintendo.toString());








    }
}