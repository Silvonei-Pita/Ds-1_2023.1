
package Interface;

public class Pato implements Animal{

    @Override
    public String emitirSom() {
        return "Quack! Quack!";
    }

    @Override
    public String comer() {
        return "Quacrack! Quacrack!";
    }
    
    
}
