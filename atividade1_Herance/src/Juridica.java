public class Juridica extends Pessoa {

    //atributos
    private String cpnj;
    private String inscricaoEstadual;


    // Construtor da Pessoa Jurídica
    public Juridica(String nome, String telefone, String cpnj, String inscricaoEstadual) {
        super(nome, telefone);
        this.cpnj = cpnj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return "Dados da Pessoa Jurídica: " +
                "\nCNPJ: " + cpnj +
                "\nInscrição Estadual: " + inscricaoEstadual +
                super.toString();
    }

    //Getters e Setters
    public String getCpnj() {
        return cpnj;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }


}
