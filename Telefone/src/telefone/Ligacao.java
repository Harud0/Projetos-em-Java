package telefone;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ligacao {
    //att
    private String numeroOrigem;
    private String numeroDestino;
    private String horarioLigacao;
    //const
    public Ligacao(String numeroOrigem, String numeroDestino) {
        this.numeroOrigem = numeroOrigem;
        this.numeroDestino = numeroDestino;
    }

    public Ligacao(Contato contatoOrigem, Contato contatoDestino) {
        this.numeroOrigem = contatoOrigem.getNumero();
        this.numeroDestino = contatoDestino.getNumero();
    }

    //met
    public void ligar(){
        System.out.println("ligando para :" + numeroDestino);
        System.out.println("chamando...");
        System.out.println("o telefone esta fora de area ou desligado");
        //dia - dd
        //mes - MM
        //ano - YY
        //hrs - HH
        //min - mm
        //seg - ss
        DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            LocalDateTime horaAtual = LocalDateTime.now();
                horarioLigacao = formatadorData.format(horaAtual);
    }

    @Override
    public String toString(){
        String info = String.format("origem: %s \tdestino: %s\thorario: %s",
                numeroOrigem ,numeroDestino ,horarioLigacao);
        return info;
    }

    //get e set
    public String getNumeroOrigem() {
        return numeroOrigem;
    }
    public void setNumeroOrigem(String numeroOrigem) {
        this.numeroOrigem = numeroOrigem;
    }

    public String getNumeroDestino() {
        return numeroDestino;
    }
    public void setNumeroDestino(String numeroDestino) {
        this.numeroDestino = numeroDestino;
    }
}
