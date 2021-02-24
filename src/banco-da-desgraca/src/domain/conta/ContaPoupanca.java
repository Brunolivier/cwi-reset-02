package domain.conta;

import br.com.banco.desgraca.domain.InstituicaoBancaria;

public class ContaPoupanca implements ContaBancaria{
    private int numeroDaConta;
    br.com.banco.desgraca.domain.InstituicaoBancaria instituicaoBancaria;


/*

Regras específicas dos tipos de contas bancárias:
ContaPoupanca: possui taxa de 2% para saques, sendo que o valor mínimo para solicitação de saque é de R$ 50,00.
Possui taxa de 0,5% para transferências para mesma instituição bancária e 1% para outras instituições bancárias;
*/

    public ContaPoupanca(int numeroDaConta, InstituicaoBancaria instituicaoBancaria) {
        this.numeroDaConta = numeroDaConta;
        this.instituicaoBancaria = instituicaoBancaria;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    @Override
    public InstituicaoBancaria getInstituicaoBancaria() {
        return instituicaoBancaria;
    }

    private void taxaSaque (){
        //TODO implementar metodo da taxa de saque e verificar qual retorno será
    }

    private void taxaTransferencia (){
        //TODO implementar metodo da taxa de transferencia verificar qual retorno sera
    }





}
