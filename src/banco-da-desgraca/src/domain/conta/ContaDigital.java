package domain.conta;

public class ContaDigital implements ContaBancaria{
    private int numeroDaConta;
    br.com.banco.desgraca.domain.InstituicaoBancaria instituicaoBancaria;



/*
Regras específicas dos tipos de contas bancárias:

ContaDigital: não possui nenhum tipo de taxa, todas as operações são gratuitas. Os saques só são permitidos se o valor
solicitado for de pelo menos R$ 10,00;

 */


    private void taxaSaque (){
        //TODO implementar metodo do valor minimo do saque e verificar qual retorno será
    }

}
