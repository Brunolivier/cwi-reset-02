package br.com.banco.desgraca.domain;

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
}