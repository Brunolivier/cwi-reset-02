/*
Endereco: representa endereços genéricos.
Deve ter o logradouro, número, complemento, bairro, cidade e estado (unidade federativa);
*/

public class Endereco {
    private String logadouro;
    private double numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private UnidadeFederativa estado;


    public Endereco(String logadouro, double numero, String complemento, String bairro, String cidade, UnidadeFederativa estado) {
        this.logadouro = logadouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }



    public String getLogadouro() {
        return logadouro;
    }

    public double getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public UnidadeFederativa getEstado() {
        return estado;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(UnidadeFederativa estado) {
        this.estado = estado;
    }
}
