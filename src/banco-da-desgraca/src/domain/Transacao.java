package domain;

import java.time.format.DateTimeFormatter;

public class Transacao {
    private Enum tipoDaTransacao;
    private DateTimeFormatter dataDaTransacao;
    private double valorDaTransacao;


    public Transacao(Enum tipoDaTransacao, DateTimeFormatter dataDaTransacao, double valorDaTransacao) {
        this.tipoDaTransacao = tipoDaTransacao;
        this.dataDaTransacao = dataDaTransacao;
        this.valorDaTransacao = valorDaTransacao;
    }


    public Enum getTipoDaTransacao() {
        return tipoDaTransacao;
    }

    public DateTimeFormatter getDataDaTransacao() {
        return dataDaTransacao;
    }

    public double getValorDaTransacao() {
        return valorDaTransacao;
    }


    public void setTipoDaTransacao(Enum tipoDaTransacao) {
        this.tipoDaTransacao = tipoDaTransacao;
    }

    public void setDataDaTransacao(DateTimeFormatter dataDaTransacao) {
        this.dataDaTransacao = dataDaTransacao;
    }

    public void setValorDaTransacao(double valorDaTransacao) {
        this.valorDaTransacao = valorDaTransacao;
    }
}