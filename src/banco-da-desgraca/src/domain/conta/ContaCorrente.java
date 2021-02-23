package domain.conta;


public class ContaCorrente implements ContaBancaria {
    private Integer numeroDaConta;
    br.com.banco.desgraca.domain.InstituicaoBancaria instituicaoBancaria;


/*
    Regras específicas dos tipos de contas bancárias:

    ContaCorrente: é livre de taxas, exceto para transferências para outras instituições bancárias
    (neste caso, a taxa é de 1% do valor a ser transferido).
    O saque só pode ser feito para valores divisíveis por 5
    (ou seja, notas de R$ 5,00, R$ 10,00, R$ 20,00, R$ 50,00, R$ 100,00 e R$ 200,00);

*/

}