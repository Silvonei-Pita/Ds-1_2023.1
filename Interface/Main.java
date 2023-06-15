
package Interface;


public class Main {
    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Pato pato = new Pato();
        Galo galo = new Galo();
        
        System.out.println("Cachorro: ");
        System.out.println("Som: " + cachorro.emitirSom());
        System.out.println("Comer: " + cachorro.comer());
        System.out.println("Gato: ");
        System.out.println("Som: " + gato.emitirSom());
        System.out.println("Comer: " + gato.comer());
        System.out.println("Pato: ");
        System.out.println("Som: " + pato.emitirSom());
        System.out.println("Comer: " + pato.comer());
        System.out.println("Galo: ");
        System.out.println("Som: " + galo.emitirSom());
        System.out.println("Comer: " + galo.comer());
        
        
    }
    
}
