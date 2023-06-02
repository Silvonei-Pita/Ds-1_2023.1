public class Motoboy extends Funcionario {

    private String cnh;

    public Motoboy(String nome, String cpf, String rg, double salario, String cnh) {
        super(nome, cpf, rg, salario);
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nDados do Motoboy: " +
                "\nCNH: " + cnh;
    }

    //Getters e Setters
    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
}
