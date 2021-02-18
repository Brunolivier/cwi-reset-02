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
    Endereco endereco;
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
        if ((beneficiario.getSalario() * mesesParaPagamento) >= (imovel.getValor() / 2))
        {
            System.out.println(imprimirPropostaAprovada());
        }
        else {
            System.out.println(imprimirPropostaNegada());
        }

    }

    public String imprimirPropostaAprovada (){
        imprimirPropostaAprovada = " " + this.beneficiario + " " + this.imovel + " " + this.mesesParaPagamento +
        " " + "Parabéns, sua proposta foi aceita!";
        //System.out.println(beneficiario);
        //System.out.println(imovel);
        //System.out.println(mesesParaPagamento);
        //System.out.println("Parábens, sua proposta foi aceita!");
        return imprimirPropostaAprovada;
    }

    public String imprimirPropostaNegada(){
        imprimirPropostaNegada = " " + this.beneficiario + " " + this.imovel + " " + this.mesesParaPagamento +
                " " + "Deu ruim, sua proposta foi recusada!";
        //System.out.println(beneficiario);
        //System.out.println(imovel);
        //System.out.println(mesesParaPagamento);
        //System.out.println("Deu ruim, sua proposta foi recusada!");
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

    public Endereco getEndereco() {
        return this.endereco;
    }

    public String getImprimirPropostaAprovada() {
        return imprimirPropostaAprovada;
    }

    public String getImprimirPropostaNegada() {
        return imprimirPropostaNegada;
    }

    public void setImprimirPropostaAprovada(String imprimirPropostaAprovada) {
        this.imprimirPropostaAprovada = imprimirPropostaAprovada;
    }

    public void setImprimirPropostaNegada(String imprimirPropostaNegada) {
        this.imprimirPropostaNegada = imprimirPropostaNegada;
    }
}