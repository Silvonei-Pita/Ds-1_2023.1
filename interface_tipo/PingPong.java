
package interface_tipo;


public class PingPong implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Dingdong! Iniciando o jogo de PingPong!");
    }

    @Override
    public void fechar() {
        System.out.println("Piringding! Fechando jogo de Pingpong!");
    }
    
    
    
}
