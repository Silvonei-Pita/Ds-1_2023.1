
package Interface2;


public class Main {
    public static void main(String[] args) {
        
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();
        
        System.out.println("Soma: 10 + 20");
        System.out.println(soma.calcular(10, 20));
        System.out.println("Subtração: 20 - 10");
        System.out.println(subtracao.calcular(20, 10));
        System.out.println("Multiplicação: 20 * 10");
        System.out.println(multiplicacao.calcular(10, 20));
        System.out.println("Divisão: 20 / 10");
        System.out.println(divisao.calcular(20, 10));
        
        
        
    }
    
}
