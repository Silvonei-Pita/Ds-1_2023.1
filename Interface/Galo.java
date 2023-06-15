
package Interface;


public class Galo implements Animal{

    @Override
    public String emitirSom() {
       return "Cocoricó!";
    }

    @Override
    public String comer() {
        return "Cocoricrok!";
    }
    
    
}
