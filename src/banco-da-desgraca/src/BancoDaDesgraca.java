package br.com.banco.desgraca;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import domain.conta.ContaBancaria;
import domain.conta.ContaDigital;

public class BancoDaDesgraca {

    public static void main(String[] args) throws Exception {

        ContaBancaria contabancaria1 = new ContaDigital(123, InstituicaoBancaria.NUBANK, 500);
        contabancaria1.consultarSaldo();


    }
}