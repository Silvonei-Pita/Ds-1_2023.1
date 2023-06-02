public class Medico extends Funcionario {

    private String crm;

    public Medico(String nome, String cpf, String rg, double salario, String crm) {
        super(nome, cpf, rg, salario);
        this.crm = crm;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nDados do Médico: " +
                "\nCRM: " + crm;
    }


    //Getters e Setters
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}
