package telefone;

import java.util.ArrayList;

public class Chamadas {
    //att
    private ArrayList<Ligacao> chamadas;

    //const
    public Chamadas() {
        this.chamadas = new ArrayList<Ligacao>();
    }

    //met
    public void adicionar(Ligacao ligacao) {
        this.chamadas.add(ligacao);
    }

    @Override
    public String toString() {
        String info = "Chamadas: \n";
        for (Ligacao ligacao : chamadas){
            info += ligacao.toString()+"\n";
        }
        return info;
    }

    //get e set
}
