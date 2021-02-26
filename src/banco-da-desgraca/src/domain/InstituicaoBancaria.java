package domain;





// REFAZER TUDO!!!!



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

    public String contasDigitais (){
        if (contasDigitais().equals(NUBANK)){
            System.out.println("Conta digital criada com sucesso");

        }
        else if (contasDigitais().equals(ITAU)){
            System.out.println("Conta digital criada com sucesso");
        }
        else {
            System.out.println("Este banco não possui conta digital.");
            //TODO Retornar um erro pois somente o itau e nubank permite conta digital
        }

    }

    public String contaPoupanca (){
        if (contaPoupanca().equals(NUBANK)){
            //TODO Retonar um erro pois somente o nubank nao permite conta poupanca
        }
        else {
            System.out.println("Conta poupança criada com sucesso");
        }
    }



    @Override
    public String toString() {
        return super.toString();
    }
}

