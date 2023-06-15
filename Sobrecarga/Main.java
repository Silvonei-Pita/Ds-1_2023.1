
package Sobrecarga;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        System.out.println("Soma de inteiros: ");
        System.out.println(calc.calcular(1, 2));
        System.out.println("Soma de números reais: ");
        System.out.println(calc.calcular(1.5, 2.5));
        System.out.println("Concatenação de Strings");
        System.out.println(calc.calcular("Cebola ", "Frita"));
        
        
    }
    
}
