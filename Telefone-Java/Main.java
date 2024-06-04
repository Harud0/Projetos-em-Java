import telefone.Contato;
import telefone.Contatos;
import telefone.Ligacao;
import telefone.Telefone;

public class Main {
    public static void main(String[] args) {
        Telefone telefone = new Telefone("8525-5679");

        Contato contato1 = new Contato("Judas", "9524-6301");
        Contato contato2 = new Contato("Lulu",  "8618-1716");
        Contato contato3 = new Contato("Carvas","9903-6358");


        Contatos telefoneContatos = telefone.getContatos();
            telefoneContatos.adicionar(contato1);
            telefoneContatos.adicionar(contato2);
            telefoneContatos.adicionar(contato3);

        System.out.println(telefoneContatos);
        System.out.println(telefoneContatos.buscar("Ju"));

        telefone.ligar(contato1);
        telefone.ligar(contato2);
        telefone.ligar(contato3);

        System.out.println(telefone.getChamadas());
        

    }
}