package projetoPessoas.src.model;

public class App {



    public static void main(String[] args) {

        Endereco endereco1 = new Endereco("Prefeito Antonio Caramez", "451", "Santa Rita", "Mendes", "casa1");
        Endereco endereco2 = new Endereco("Ladeira Santa Tereza", "40", "Humberto Antunes", "Volta Redonda", "fundos");
        Endereco endereco3 = new Endereco("Ladeira Joaquim de Sá", "23", "Martins Costa", "Mogi das Cruzes", "casa2");

        Pessoa pessoa1 = new Pessoa("Tania", "8433857900", "24999279187", "Feminino", endereco1);
        Pessoa pessoa2 = new Pessoa("Maria", "15733860988", "24999114099", "Feminino", endereco2);
        Pessoa pessoa3 = new Pessoa("Nathan", "17849980766", "24999980171", "Masculino", endereco3);
        



        pessoa1.seApresentar(null);
        pessoa2.seApresentar(null);
        pessoa3.seApresentar(null);
        
    }
}
