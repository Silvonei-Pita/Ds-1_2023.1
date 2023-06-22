
package interface_impressora;


public class LexMark implements Impressora{

    @Override
    public void imprimir() {
        System.out.println(" /// IMPRESSORA LEXMARK /// ");
        System.out.println("Preparando tonner.");
        System.out.println("Imprimindo...");
    }
    
    
    
}
