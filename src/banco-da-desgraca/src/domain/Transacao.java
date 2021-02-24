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





}