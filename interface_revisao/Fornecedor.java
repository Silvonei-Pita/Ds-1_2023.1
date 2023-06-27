
package interface_revisao;


public class Fornecedor extends Juridica{
    
    //Atributos
    private Setor_Juridica setor;
    private Produto produto;

    //Construtor
    public Fornecedor(Setor_Juridica setor, Produto produto, String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, nome, telefone, email, endereco);
        this.setor = setor;
        this.produto = produto;
    }
   

    //toString
    @Override
    public String toString() {
        return super.toString() +
                "Fornecedor " + 
               "\nSetor: " + setor + 
               "\nProduto: " + produto;
    }

    //Getters and Setters

    public Setor_Juridica getSetor() {
        return setor;
    }

    public void setSetor(Setor_Juridica setor) {
        this.setor = setor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
    
    
}
