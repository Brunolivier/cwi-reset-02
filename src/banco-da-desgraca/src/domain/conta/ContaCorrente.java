package domain.conta;


import domain.InstituicaoBancaria;

import java.time.LocalDate;

public class ContaCorrente implements ContaBancaria {
    private int numeroDaConta;
    private InstituicaoBancaria instituicaoBancaria;
    private double saldo;

/*

    Regras específicas dos tipos de contas bancárias:

    ContaCorrente: é livre de taxas, exceto para transferências para outras instituições bancárias
    (neste caso, a taxa é de 1% do valor a ser transferido).
    O saque só pode ser feito para valores divisíveis por 5
    (ou seja, notas de R$ 5,00, R$ 10,00, R$ 20,00, R$ 50,00, R$ 100,00 e R$ 200,00);

*/

    public ContaCorrente(int numeroDaConta, InstituicaoBancaria instituicaoBancaria, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.instituicaoBancaria = instituicaoBancaria;
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    @Override
    public InstituicaoBancaria getInstituicaoBancaria() {
        return instituicaoBancaria;
    }

    @Override
    public Double consultarSaldo() {
        System.out.println("Seu saldo é de");
        return saldo;

    }

    @Override
    public void depositar(Double valor) {
        saldo += valor;
        System.out.println("Valor " + valor + " depositado com sucesso");
        System.out.println("Novo saldo: " + saldo);

    }

    @Override
    public void sacar(Double valor) {
        if ((valor <= saldo) && (valor % 5 == 0)){
            saldo -= valor;
            System.out.println("Saque realizado no importe de: " + valor);
            saldo = saldo - valor;
            System.out.println("Novo saldo: " + saldo);

        }
        else {
            //TODO Implementar erro
            System.out.println("Operação não realizada");
        }

    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        if ((instituicaoBancaria.equals(contaDestino.getInstituicaoBancaria())) && (valor <= saldo)){
            saldo = saldo - valor;
            contaDestino.depositar(valor); // VERIFICAR O RECEBIMENTO DO VALOR NA CONTA DESTINO
            System.out.println("Valor " + valor + "transferido com sucesso");
            System.out.println("Novo saldo: " + saldo);
        }
        else if ((valor + (valor * 0.1) <= saldo) && (getInstituicaoBancaria() != contaDestino.getInstituicaoBancaria())) {
            saldo = saldo - (valor + (valor * 0.1));
            contaDestino.depositar(valor); // VERIFICAR O RECEBIMENTO DO VALOR NA CONTA DESTINO
            System.out.println("Valor " + valor + "transferido com sucesso");
            System.out.println("Novo saldo: " + saldo);
        }
        else{
            //TODO implementar erro
            System.out.println("Transferência não realizada");
        }

    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {

    }

    public double getSaldo() {
        return saldo;
    }



}


