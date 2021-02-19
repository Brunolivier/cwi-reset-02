public class Casa extends Imovel {
    private String patio;


    public Casa(Endereco endereco, double valor, String patio) {
        super(endereco, valor);
        this.patio = patio;
    }

    public String getPatio() {
        return patio;
    }


}
