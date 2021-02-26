package domain;

public enum TipoTransacao {
    CONSULTARSALDO,
    DEPOSITAR,
    SACAR,
    TRANSFERIR,
    EXIBIREXTRATO;

    TipoTransacao() {
    }

    public String consultarSaldo (){

    }

    public double depositar (){

    }

    public double sacar (){


    }

    public double transferir (){

    }

    public String exibirExtrato (){

    }



    @Override
    public String toString() {
        return "TipoTransacao{}";
    }



}