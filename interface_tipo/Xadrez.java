
package interface_tipo;

public class Xadrez implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Bem-vindo meu rei! Iniciando jogo de Xadrez");
    }

    @Override
    public void fechar() {
        System.out.println("Até logo, meu senhor! Fechando jogo de Xadrez");
    }
    
}
