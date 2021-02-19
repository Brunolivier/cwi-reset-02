/*
Imovel: representa os imóveis que estarão cadastrados no sistema.
Deve ter somente o endereço e valor.
Como comportamento, é necessário que o imóvel tenha um método apresentacao que retorne uma String com todas as
informações do imóvel (ex.: "Imóvel localizado no endereço X. Valor: R$ Y").
 */

import java.sql.SQLOutput;

public abstract class Imovel{
    private String apresentacao;
    private Endereco endereco;
    private double valor;

    public Imovel(Endereco endereco, double valor) {
        this.endereco = endereco;
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

    public String apresentacao() {
        apresentacao = "Imóvel localizado no endereço: " + this.getEndereco() + "no valor de: " + this.valor;
        return apresentacao;

    }

}
