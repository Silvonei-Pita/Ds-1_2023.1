
package tipo_e_sobrescrita;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Util {
    
    public static String formatarData(LocalDate data){
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return formatar.format(data);
    }
    
    public static String formatarMonetario(double valor){
        NumberFormat formatar = NumberFormat.getCurrencyInstance();
        return formatar.format(valor);
    }
    
    public static String validar(Object objeto){
        String resultado;
        if (objeto instanceof Autenticavel){
            resultado = "Validado";
        } else {
            resultado = "Invalidado";
        }
        return resultado;
        
    }
    
    
}
