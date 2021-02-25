package domain.conta;
import br.com.banco.desgraca.domain.InstituicaoBancaria;

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

    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {

    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {

    }

    public double getSaldo() {
        return saldo;
    }



}


