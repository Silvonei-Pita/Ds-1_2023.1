
package interface_revisao;


public class Produto {
    
    //Atributos
    private String nome;
    private String categoria;
    private double preco;
    
    //Construtor
    public Produto(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }
    
    //toString
    @Override
    public String toString() {
        return "Produto " + 
               "\nNome: " + nome + 
               "\nCategoria: " + categoria + 
               "\nPreço: " + preco;
    }
    
    
    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
}
