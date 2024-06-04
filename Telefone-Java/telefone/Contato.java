package telefone;

public class Contato {
    //att
    private String nome;
    private String numero;

    //const
    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    //met

    @Override
    public String toString() {
        String infos = String.format("Nome: %s  \tNumero: %s",nome ,numero);
        return infos;
    }

    //get e set

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
}
