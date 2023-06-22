
package interface_impressora;


public class Epson implements Impressora{

    @Override
    public void imprimir() {
        System.out.println(" *** IMPRESSORA EPSON *** ");
        System.out.println("Preparando tonner.");
        System.out.println("Imprimindo...");
        
    }
 
}
