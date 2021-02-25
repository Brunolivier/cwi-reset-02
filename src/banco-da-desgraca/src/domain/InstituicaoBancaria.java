package br.com.banco.desgraca.domain;

import java.sql.SQLOutput;

public enum InstituicaoBancaria {

    BANCO_DO_BRASIL,
    BRADESCO,
    CAIXA,
    ITAU,
    NUBANK;



/*
Regras sobre instituições bancárias:
Somente Itaú e Nubank permitem contas digitais;
Somente Nubank não permite conta poupança.
*/

    InstituicaoBancaria() {
    }


    private void regrasInstituicoesBancarias (){
        //TODO criar metodo das regras
    }

    public void contasDigitais (){
        if (contasDigitais() == NUBANK){
            System.out.println("Conta digital criada com sucesso");

        }
        else if (contasDigitais() == ITAU){
            System.out.println("Conta digital criada com sucesso");
        }
        else {
            //TODO Retornar um erro pois somente o itau e nubank permite conta digital


        }
    }

    public void contaPoupanca (){
        if (contaPoupanca() == NUBANK){
            //TODO Retonar um erro pois somente o nubank nao permite conta poupanca
        }
        else {
            System.out.println("Conta poupança criada com sucesso");
        }
    }



}

