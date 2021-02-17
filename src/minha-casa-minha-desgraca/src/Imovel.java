/*
Imovel: representa os imóveis que estarão cadastrados no sistema.
Deve ter somente o endereço e valor.
Como comportamento, é necessário que o imóvel tenha um método apresentacao que retorne uma String com todas as
informações do imóvel (ex.: "Imóvel localizado no endereço X. Valor: R$ Y").
 */

import java.sql.SQLOutput;

public class Imovel extends Endereco{
    private String apresentacao;
    Endereco endereco;
    private double valor;



    public Imovel(String logadouro, double numero, String complemento, String bairro, String cidade,
                  UnidadeFederativa estado, double valor) {
        super(logadouro, numero, complemento, bairro, cidade, estado);
        this.valor = valor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public double getValor() {
        return valor;
    }

    public String getApresentacao() {
        return apresentacao;
    }

    public String apresentacao(){
       apresentacao = "Imóvel localizado no endereço: " + getLogadouro() + " " + getNumero() + getComplemento() + getBairro()
               + getCidade() + getEstado() + "no valor de: " + this.valor;

        return apresentacao;


    }


//System.out.println("Imóvel localizado no endereço: " + this.endereco)
// System.out.println("Valor: " + valor);

}
