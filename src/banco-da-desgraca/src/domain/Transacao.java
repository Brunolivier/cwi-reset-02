package br.com.banco.desgraca.domain;

import java.time.format.DateTimeFormatter;

public class Transacao {
    private void tipoDaTransacao;
    private DateTimeFormatter dataDaTransacao;
    private double valorDaTransacao;


    public Transacao(void tipoDaTransacao, DateTimeFormatter dataDaTransacao, Integer valorDaTransacao) {
        this.tipoDaTransacao = tipoDaTransacao;
        this.dataDaTransacao = dataDaTransacao;
        this.valorDaTransacao = valorDaTransacao;
    }

    



}