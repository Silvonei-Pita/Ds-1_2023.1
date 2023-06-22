
package interface_tipo;


public class TiroAoAlvoOnline implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Bem-vindo ao TiroAoAlvo Online!");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando... Obrigado por jogar TiroAoAlvo!");
    }
    
    
}
