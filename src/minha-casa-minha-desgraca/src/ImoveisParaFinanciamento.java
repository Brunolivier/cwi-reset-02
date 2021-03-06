import com.sun.deploy.security.SelectableSecurityManager;

/*
ImoveisParaFinanciamento: esta classe serve como a "base de dados" de todos os imóveis disponíveis para financiamento.
Repare que você precisará implementar a lógica do método "registrarImovel", conforme sua documentação,
bem como complementar a lógica do método "buscarOpcoes".
Não é necessário criar nenhum método novo.
 */

import java.util.ArrayList;
import java.util.List;

public class ImoveisParaFinanciamento {

    private List<Imovel> imoveis;

    public ImoveisParaFinanciamento() {
        imoveis = new ArrayList<>();
    }



    /**
     * Registra um imóvel como opção de financiamento. O imóvel só pode ser aceito se o valor dele for
     * maior ou igual a R$ 50.000,00 e menor ou igual a R$ 1.000.000,00.
     * <p>
     * Obs.: quando o valor do imóvel não estiver na faixa solicitada, deve ser apresentada a seguinte mensagem
     * (substituindo XXX pelo valor do imóvel):
     * " > Atenção, problema de registro! Imóveis com valor R$ XXX não são aceitos no programa."
     */
    public void registrarImovel(Imovel imovel) {


        if ((imovel.getValor() < 50000) || (imovel.getValor() > 1000000)) {
         System.out.println(" > Atenção, problema de registro do imóvel! Imóveis com valor R$"
                 + imovel.getValor() + " não são aceitos no programa.");
        }
        else {
            imoveis.add(imovel);
            System.out.println("Imovel registrado " + imovel.apresentacao());
                    //imovel.getEndereco().getLogadouro() + imovel.getEndereco().getNumero()
                    //+ imovel.getEndereco().getComplemento() + imovel.getEndereco().getBairro()
                    //+ imovel.getEndereco().getCidade() + imovel.getEndereco().getEstado() + imovel.getValor());
            // se "imovel" corresponder às regras, adicioná-lo à lista "imoveis" com o seguinte código:
            //    imoveis.add(imovel);
        }
    }


        /**
         * Retorna opções de financiamento cujo valor do imóvel seja inferior ou igual ao valor limite que foi informado.
         */
        public List<Imovel> buscarOpcoes(double valorLimite) {

            List<Imovel> opcoes = new ArrayList<>();

            // percorre a lista de imóveis
            for (Imovel imovel : imoveis) {
                if (imovel.getValor() <= valorLimite) {
                    opcoes.add(imovel);



                    // se "imovel" corresponder às regras, adicioná-lo à lista de opcoes com o seguinte código:
                    //    opcoes.add(imovel);
                }

            }

            return opcoes;
        }

}