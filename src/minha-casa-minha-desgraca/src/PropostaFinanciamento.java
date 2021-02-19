import com.sun.deploy.security.SelectableSecurityManager;

/*
PropostaFinanciamento: esta classe representa uma proposta de financiamento que deve ser avaliada.
Ela precisará ter um beneficiário, um imóvel e um prazo de pagamento (expresso em meses).
Você precisará implementar a lógica do método validarProposta conforme sua documentação,
atentando para não modificar sua assinatura (ou seja: nada de adicionar argumentos neste método).
Você também precisará criar dois métodos internos:

imprimirPropostaAprovada: deve exibir todas as informações da proposta (beneficiário, imóvel, prazo)
e parabenizar o beneficiário pois a proposta dele foi aceita;

imprimirPropostaNegada: deve exibir todas as informações da proposta (beneficiário, imóvel, prazo)
e xingar o beneficiário pois a proposta não foi aceita.

Obs.: os dois métodos de impressão não podem ser chamados fora da classe.
 */

public class PropostaFinanciamento {
    Beneficiario beneficiario;
    Imovel imovel;
    private int mesesParaPagamento;
    private String imprimirPropostaAprovada;
    private String imprimirPropostaNegada;


    public PropostaFinanciamento(Beneficiario beneficiario, Imovel imovel, int mesesParaPagamento) {
        this.beneficiario = beneficiario;
        this.imovel = imovel;
        this.mesesParaPagamento = mesesParaPagamento;
    }

    /**
     * Valida a proposta de financiamento e apresenta o resultado para o cliente.
     *
     * A proposta de financiamento é aceita somente se o salário do beneficiário multiplicado pelo prazo de pagamento
     *   for equivalente a pelo menos 50% do valor do imóvel.
     *
     *   Esta regra possui duas exceções: se o imóvel se localiza no estado SP ou RJ,
     *      o salário multiplicado pelo prazo deve ser equivalente a 65% e 60% do valor imóvel (respectivamente).
     */


    public void validarProposta() {
        if ((this.imovel.getEndereco().getEstado() != UnidadeFederativa.SAO_PAULO) &&
                (this.imovel.getEndereco().getEstado() != UnidadeFederativa.RIO_DE_JANEIRO) &&
                ((this.beneficiario.getSalario() * this.mesesParaPagamento) >= (this.imovel.getValor() / 2))) {
            System.out.println(imprimirPropostaAprovada());
        }
        else if ((this.imovel.getEndereco().getEstado() == UnidadeFederativa.SAO_PAULO) &&
                ((beneficiario.getSalario() * this.mesesParaPagamento) >= ((this.imovel.getValor() * 65) / 100))) {
                System.out.println(imprimirPropostaAprovada());
        }
        else if ((this.imovel.getEndereco().getEstado() == UnidadeFederativa.RIO_DE_JANEIRO) &&
                ((this.beneficiario.getSalario() * this.mesesParaPagamento) >= ((this.imovel.getValor() * 60) / 100))) {
                System.out.println(imprimirPropostaAprovada());
        }

        else {
            System.out.println(imprimirPropostaNegada());
        }

    }

    public String imprimirPropostaAprovada (){
        imprimirPropostaAprovada = "Beneficiário " + this.beneficiario.getNome() + ", imóvel " + this.imovel.apresentacao()
                + ", meses para pagamento " + this.mesesParaPagamento + ". Parabéns, sua proposta foi aceita!";
        return imprimirPropostaAprovada;
    }

    public String imprimirPropostaNegada(){
        imprimirPropostaNegada = "Beneficiário " + this.beneficiario.getNome() + " , imóvel " + this.imovel.apresentacao()
                + " , meses para pagamento " + this.mesesParaPagamento + ". Deu ruim, sua proposta foi recusada!";
        return imprimirPropostaNegada;
    }

     public Beneficiario getBeneficiario() {
        return beneficiario;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public int getMesesParaPagamento() {
        return mesesParaPagamento;
    }

    public String getImprimirPropostaAprovada() {
        return imprimirPropostaAprovada;
    }

    public String getImprimirPropostaNegada() {
        return imprimirPropostaNegada;
    }
}