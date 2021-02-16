/*
Imovel: representa os imóveis que estarão cadastrados no sistema.
Deve ter somente o endereço e valor.
Como comportamento, é necessário que o imóvel tenha um método apresentacao que retorne uma String com todas as
informações do imóvel (ex.: "Imóvel localizado no endereço X. Valor: R$ Y").
 */

public class Imovel extends Endereco{
    Endereco endereco;
    private double valor;


    public Imovel(String logadouro, double numero, String complemento, String bairro, String cidade,
                  UnidadeFederativa estado, Endereco endereco, double valor) {
        super(logadouro, numero, complemento, bairro, cidade, estado);
        this.endereco = endereco;
        this.valor = valor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public double getValor() {
        return valor;
    }

    public String apresentacao(){
        System.out.println("Imóvel localizado no endereço: " + this.endereco);
        System.out.println("Valor: " + this.valor);
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
