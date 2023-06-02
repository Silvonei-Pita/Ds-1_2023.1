
package atividadeHerance5;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        
       //Criar objetos
       //Endereco
       Endereco endereco = new Endereco("Dendezeiros", "92", "Em frente ao CPM", "12343-10", "Salvador", UnidadeFederativa.BAHIA);
       //Cliente ^ Fisica
       Cliente cliente = new Cliente(1, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(2000, Month.MARCH, 10), 1, "Carla", "7192112-3456", "carla@hotmail.com", endereco);
 
       //PrestacaoServico ^ Juridica
       PrestacaoServico prestacao_servico1 = new PrestacaoServico(LocalDate.of(1995, Month.MARCH, 10), LocalDate.of(2000, Month.AUGUST, 20), "23.567.12/123", "12345678", 2, "Troce", "(71)8954-8432", "troce@gmail.com", endereco);
               
       //Fornecedor ^ Juridica
       Fornecedor fornecedor1 = new Fornecedor("Produtos Enlatados", "123.456.789/000", "12345678910", 3, "Enlatadation", "(71)3245-9875", "Enlatadation@hotmail.com", endereco);
       
       //Engenheiro ^ Funcionario
       Engenheiro engenheiro1 = new Engenheiro("1234567810", "987654321", "234567891", "1-2345-2212-12", Setor.ENGENHARIA, 3000, Genero.MASCULINO, EstadoCivil.CASADO, LocalDate.of(2004, Month.JUNE, 20), 4, "Raique", "(71)1234-9753", "trabalhador1@gmail.com", endereco);
       
       //Medico ^ Funcionario
       Medico medico1 = new Medico("1234567810", "987654321", "234567891", "1-2345-2212-12", Setor.ENGENHARIA, 3000, Genero.MASCULINO, EstadoCivil.CASADO, LocalDate.of(2004, Month.JUNE, 20), 4, "Eduardo", "(71)1234-9753", "trabalhador2@gmail.com", endereco);
       
       //Advogado ^ Funcionario
       Advogado advogado1 = new Advogado("1234567810", "987654321", "234567891", "1-2345-2212-12", Setor.ENGENHARIA, 3000, Genero.MASCULINO, EstadoCivil.CASADO, LocalDate.of(2004, Month.JUNE, 20), 4, "Renan", "(71)1234-9753", "trabalhador3@gmail.com", endereco);
       
       
        
        
        
    }
    
}
