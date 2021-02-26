package domain.conta;



import domain.InstituicaoBancaria;

import java.time.LocalDate;



// REFAZER TUDO!!!!

public class ContaDigital implements ContaBancaria {
    private int numeroDaConta;
    private InstituicaoBancaria instituicaoBancaria;
    private double saldo;



/*
Regras específicas dos tipos de contas bancárias:

ContaDigital: não possui nenhum tipo de taxa, todas as operações são gratuitas. Os saques só são permitidos se o valor
solicitado for de pelo menos R$ 10,00;

 */

    public ContaDigital(int numeroDaConta, InstituicaoBancaria instituicaoBancaria, double saldo) {
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
        if (valor >= 10 && valor <= saldo){
            System.out.println("Saque realizado no importe de: " + valor);
            saldo = saldo - valor;
            System.out.println("Novo saldo: " + saldo);
        }
        else{
            //TODO Implementar erro
            System.out.println("Operação não realizada");
        }

    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        if (valor <= saldo){
            saldo = saldo - valor;
            contaDestino.depositar(valor); // VERIFICAR O RECEBIMENTO DO VALOR NA CONTA DESTINO
            System.out.println("Valor " + valor + "transferido com sucesso");
            System.out.println("Novo saldo: " + saldo);
        }
        else {
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
