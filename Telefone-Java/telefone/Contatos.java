package telefone;

import java.util.ArrayList;

public class Contatos {
    //att
    private ArrayList<Contato> contatos;

    //const
    public Contatos(){
        this.contatos = new ArrayList<Contato>();
    }

    //met
    public void adicionar(String nome, String numero){
        Contato novoContato = new Contato(nome,numero);
            contatos.add(novoContato);
    }

    public void adicionar(Contato novoContato){
            contatos.add(novoContato);
    }

    public Contatos buscar(String palvraChave){
        String palavraChaveMinuscula = palvraChave.toLowerCase();//converte todas as letras para minusculas
        Contatos contatosFiltrados = new Contatos();

        for (Contato contato : contatos){
            String nomeContatoMinuculo = contato.getNome().toLowerCase();

            if (nomeContatoMinuculo.startsWith(palavraChaveMinuscula)){
                    System.out.println("Contatos filtrados ");
                contatosFiltrados.adicionar(contato);
            }
        }
        return contatosFiltrados;
    }

    @Override
    public String toString() {
        String infos = "Contatos: \n";
        for(Contato contato: contatos){
            infos = infos + contato.toString() + "\n";
        }
        return infos;
    }

    //get e set
    public ArrayList<Contato> getContatos() {
        return contatos;
    }

}
