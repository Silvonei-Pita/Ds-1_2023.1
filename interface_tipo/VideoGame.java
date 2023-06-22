
package interface_tipo;

public class VideoGame {
    
    private Jogo jogo;
    
    public void ligar(){
        System.out.println("Ligando o videogame");
        
    };
    public void jogar(Jogo jogo){
        this.jogo = jogo;
        jogo.jogar();
    };
    public void fechar(){
       this.jogo.fechar();
        
    };
    public void desligar(){
        System.out.println("Desligando o videogame!");

    };
    
    
    
    
}
