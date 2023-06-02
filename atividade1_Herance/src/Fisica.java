import java.time.LocalDate;
import java.time.Period;

public class Fisica extends Pessoa {

    //atributos
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;


    // Construtor da pessoa física
    public Fisica(String nome, String telefone, String cpf, String rg, LocalDate dataNascimento) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {

        return "Dados da pessoa física:" +
                "\nCPF: " + cpf +
                "\nRG: " + rg +
                "\nData de Nascimento: " + dataNascimento +
                "\nIdade: " + this.getIdade() +
                super.toString();
    }


    // this.dataNascimento ou dataNascimento
    public int getIdade() {
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }

    //Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


}



