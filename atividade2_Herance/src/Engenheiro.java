public class Engenheiro extends Funcionario {

    private String crea;


    public Engenheiro(String nome, String cpf, String rg, double salario, String crea) {
        super(nome, cpf, rg, salario);
        this.crea = crea;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nDados do Engenheiro: " +
                "\nCREA: " + crea;
    }


    //Getters e Setters

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
}
