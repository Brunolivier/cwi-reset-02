package domain.conta;

import br.com.banco.desgraca.domain.InstituicaoBancaria;

import java.time.LocalDate;

/**
 *    !!!   ATENÇÃO: ESTA CLASSE NÃO DEVE SER MODIFICADA   !!!
 *
 * Contrato para especificação de contas bancárias.
 *   A gestão do saldo da domain.conta e das transações, além das taxas, é responsabilidade de cada implementação.
 */
public interface ContaBancaria {

    /**
     * Retorna a instituição bancária à qual a domain.conta pertence.
     *
     * @return A instituição bancária.
     */
    InstituicaoBancaria getInstituicaoBancaria();


    /**
     * Consulta o saldo atual da domain.conta bancária.
     *
     * @return O saldo da domain.conta bancária.
     */
    Double consultarSaldo();


    /**
     * Deposita o valor informado na domain.conta e registra uma transação de entrada.
     *   Atentar para o cálculo das taxas.
     *
     * @param valor O valor a ser depositado na domain.conta.
     */
    void depositar(Double valor);


    /**
     * Saca o valor informado da domain.conta, se a domain.conta possuir saldo suficiente, e registra uma transação de saída.
     *   Atentar para o cálculo das taxas.
     *
     * @param valor O valor a ser sacado da domain.conta.
     */
    void sacar(Double valor);


    /**
     * Efetua a transferência de um valor da domain.conta atual para a domain.conta de destino,
     *      registrando uma transação de saída na domain.conta de origem e uma de entrada na domain.conta de destino.
     *   A transferência só pode ser feita se houver saldo suficente na domain.conta.
     *
     * @param valor O valor a ser transferido da domain.conta atual para a domain.conta de destino.
     * @param contaDestino A domain.conta que receberá o valor.
     */
    void transferir(Double valor, ContaBancaria contaDestino);


    /**
     * Exibe o extrato da domain.conta para o período informado.
     *   Se não for passada a data de início, deve filtrar somente pela data de fim.
     *   Se não for passada a data de fim, deve filtrar somente pela data de início.
     *   Se não for passada nenhuma data, deve exibir todos os registros.
     *
     * É exibido o símobolo "+" para indicar entrada na domain.conta e "-" para indicar saída da domain.conta. Ex. de extrato:
     *
     * <code>
     *     ----- EXTRATO CONTA DIGITAL NUBANK 12345
     *     +   R$ 100,00   01/07/2020
     *     +    R$ 50,00   06/07/2020
     *     -    R$ 10,00   11/04/2020
     *     -----
     * </code>
     *
     * @param inicio Data de início para filtro. Pode ser null.
     * @param fim Data de fim para filtro. Pode ser null.
     */
    void exibirExtrato(LocalDate inicio, LocalDate fim);
}