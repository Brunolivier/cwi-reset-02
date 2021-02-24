package br.com.banco.desgraca.domain;

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


    private String regrasInstituicoesBancarias (){
        //TODO criar metodo das regras
    }

    public void contasDigitais (){
        if (contasDigitais() == NUBANK){
            System.out.println("");

        }
        else if (contasDigitais() == ITAU){
            System.out.println();
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
            System.out.println();
        }
    }






}

