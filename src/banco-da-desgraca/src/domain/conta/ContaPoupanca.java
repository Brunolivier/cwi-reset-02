package domain.conta;

import br.com.banco.desgraca.domain.InstituicaoBancaria;

import java.time.LocalDate;


public class ContaPoupanca implements ContaBancaria{
    private int numeroDaConta;
    private InstituicaoBancaria instituicaoBancaria;
    private double saldo;


/*

Regras específicas dos tipos de contas bancárias:
ContaPoupanca: possui taxa de 2% para saques, sendo que o valor mínimo para solicitação de saque é de R$ 50,00.
Possui taxa de 0,5% para transferências para mesma instituição bancária e 1% para outras instituições bancárias;
*/

    public ContaPoupanca(int numeroDaConta, InstituicaoBancaria instituicaoBancaria, double saldo) {
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
        // IMPLEMENTAR TRANSACOES PADROES NA CLASSE TIPO DE TRANSACAO?
        saldo += valor;
        System.out.println("Valor " + valor + " depositado com sucesso");
        System.out.println("Novo saldo: " + saldo);

    }

    @Override
    public void sacar(Double valor) {
        if (valor >= 50 && valor + (valor * 0.02) <= saldo) {
            saldo = saldo - valor + (valor * 0.02); // CRIAR UMA VARIAVEL/METODO PARA TAXA DE SAQUE - MELHOR LEGIVEL
            System.out.println("Saque realizado com sucesso");
            System.out.println("Novo saldo: " + saldo);
        }
        else {
            //TODO implementar erro
            System.out.println("Operação não realizada.");
        }

    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        // CRIAR UMA VARIAVEL/METODO PARA TAXA E CHECAGEM DA INSTITUICAO - DEIXAR MELHOR LEGIVEL
        if ((valor + (valor * 0.05) <= saldo) && (getInstituicaoBancaria().equals(contaDestino.getInstituicaoBancaria()))) {
            saldo = saldo - valor + (valor * 0.05);
            contaDestino.depositar(valor); // VERIFICAR O RECEBIMENTO DO VALOR NA CONTA DESTINO
            System.out.println("Valor " + valor + "transferido com sucesso");
            System.out.println("Novo saldo: " + saldo);
        }

        else if ((valor + (valor * 0.1) <= saldo) && (getInstituicaoBancaria() != contaDestino.getInstituicaoBancaria())) {
            saldo = saldo - valor + (valor * 0.05);
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
        public void exibirExtrato (LocalDate inicio, LocalDate fim){

        }

        public double getSaldo () {
            return saldo;
        }


    }

}
