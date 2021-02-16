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

public class PropostaFinanciamento extends Imovel{
    private Beneficiario beneficiario;
    private Imovel imovel;
    private int mesesParaPagamento;


    public PropostaFinanciamento(String nome, double salario, Beneficiario beneficiario, Imovel imovel, int mesesParaPagamento) {
        super(nome, salario);
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
        if ((getSalario() * mesesParaPagamento) >= (imovel.getValor() / 2)
        {
            System.out.println(imprimirPropostaAprovada());
        }
        else {
            System.out.println(imprimirPropostaNegada());
        }


    }

    public String imprimirPropostaAprovada (){
        System.out.println(beneficiario);
        System.out.println(imovel);
        System.out.println(mesesParaPagamento);
        System.out.println("Parábens, sua proposta foi aceita!");
    }

    public String imprimirPropostaNegada(){
        System.out.println(beneficiario);
        System.out.println(imovel);
        System.out.println(mesesParaPagamento);
        System.out.println("Deu ruim, sua proposta foi negada!");
    }

}