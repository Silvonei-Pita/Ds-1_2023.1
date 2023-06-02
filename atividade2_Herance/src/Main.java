public class Main {
    public static void main(String[] args) {

        //Instanciar objetos
        Engenheiro engenheiro_1 = new Engenheiro("Caique", "400.028.922-12", "892.2400.218.1", 4000.0 , "123456789-0");
        Motoboy motoboy_1 = new Motoboy("Kokoroto", "457.421.234-12", "321.313.421-2", 3000.50, "123456789");
        Medico medico_1 = new Medico("Marcos", "213.754.135-85", "21370120-21", 3500, "3371456");

        //Exibir dados

        System.out.println(engenheiro_1.toString());
        System.out.println();
        System.out.println(motoboy_1.toString());
        System.out.println();
        System.out.println(medico_1.toString());





    }
}