import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MinhaCasaMinhaDesgraca {

    public static void main(String[] args) throws Exception {

        System.out.println("\n ### Olá, seja bem vindo ao magnífico programa Minha Casa - Minha Desgraça ###\n");

        ImoveisParaFinanciamento opcoesParaFinanciamento = new ImoveisParaFinanciamento();



        /**
         * INÍCIO
         *
         * NÃO MODIFICAR ESTA CLASSE ANTES DESTA LINHA.
         */
/*
        Imovel imovel1 = new Imovel("rua dos Testes", 404, "casa", "Matrix", "Zion",
                UnidadeFederativa.MINAS_GERAIS, 300000);

        Beneficiario beneficiario1 = new Beneficiario("Bruno", 5000);

        Endereco endereco1 = new Endereco("rua dos testes2", 777, "casa", "certo",
                "Beaga", UnidadeFederativa.MINAS_GERAIS);

        opcoesParaFinanciamento.registrarImovel(imovel1);

        opcoesParaFinanciamento.registrarImovel(new Imovel("rua dos Medicos", 88, "casa",
                "Alipio de Melo","Belo Horizonte", UnidadeFederativa.MINAS_GERAIS, 40000));
        opcoesParaFinanciamento.registrarImovel(new Imovel("rua dos Advogados", 3, "casa",
                "Castelo", "Contagem", UnidadeFederativa.MINAS_GERAIS, 500000));
        opcoesParaFinanciamento.registrarImovel(new Imovel("rua dos Programadores", 505,
                "apartamento", "Java", "Boolean", UnidadeFederativa.RIO_GRANDE_DO_SUL, 1000000));
        opcoesParaFinanciamento.registrarImovel(new Imovel("rua dos Engenheiros", 90, "casa",
                "Alipio de Melo","Belo Horizonte", UnidadeFederativa.MINAS_GERAIS, 600000));
        opcoesParaFinanciamento.registrarImovel(new Imovel("rua dos Cientistas", 3000, "casa",
                "Castelo", "Contagem", UnidadeFederativa.MINAS_GERAIS, 900000));
        opcoesParaFinanciamento.registrarImovel(new Imovel("rua dos Mecanicos", 200,
                "apartamento", "Java", "Boolean", UnidadeFederativa.RIO_GRANDE_DO_SUL, 2000000));
        */
        Endereco endereco1 = new Endereco("rua para testar", 505, "casa", "Matrix",
                "Beaga", UnidadeFederativa.MINAS_GERAIS);
        Imovel imovel1 = new Imovel("rua do teste", 606, "ap","texas", "BH",
                UnidadeFederativa.MINAS_GERAIS, endereco1,700000);
        opcoesParaFinanciamento.registrarImovel(imovel1);



        /**
         * FIM
         *
         * NÃO MODIFICAR ESTA CLASSE APÓS ESTA LINHA.
         */



        List<Imovel> todasAsOpcoes = opcoesParaFinanciamento.buscarOpcoes(Double.MAX_VALUE);
        if (todasAsOpcoes == null || todasAsOpcoes.isEmpty()) {
            throw new RuntimeException("\n\nAtenção! Você precisa registrar opções de financiamento antes de começar a usar o programa.\n"
                    + "Use o método 'registrarImovel', do objeto 'opcoesParaFinanciamento', para incluir algumas opções.\n");
        }

        System.out.println("\nVamos lá, preciso de algumas respostas...\n");
        Thread.sleep(1000);

        System.out.println(" Qual é o teu nome?");
        String nomeBeneficiario = new Scanner(System.in).next();
        Thread.sleep(500);

        System.out.println(" Agora eu preciso saber sobre a mascada, "+ nomeBeneficiario +". Qual é o teu salário?");
        double salarioBeneficiario = new Scanner(System.in).nextDouble();
        Thread.sleep(500);

        Beneficiario beneficiario = new Beneficiario(nomeBeneficiario, salarioBeneficiario);

        System.out.println(" Hummmm, tá grandão hein. E qual é o limite do valor de imóveis que você procura?");
        double valorParaPesquisa = new Scanner(System.in).nextDouble();
        Thread.sleep(500);

        System.out.println("\nTá, deixa eu ver aqui o que eu tenho de opções até "+ DecimalFormat.getCurrencyInstance().format(valorParaPesquisa) +"...");
        Thread.sleep(new Random().nextInt(4000) + 1000);

        List<Imovel> opcoesViaveis = opcoesParaFinanciamento.buscarOpcoes(valorParaPesquisa);
        if (opcoesViaveis == null || opcoesViaveis.isEmpty()) {
            throw new RuntimeException("\n\nPQP! Essa desgraça de programa não tem casas neste valor! Comece uma nova simulação.");
        }

        System.out.println("\nCerto! Encontrei "+ opcoesViaveis.size() + " opções aqui. Dá uma olhada:");
        int index = 0;
        for (Imovel imovel : opcoesViaveis) {
            System.out.printf(" [%d] %s\n", ++index, imovel.apresentacao());
            Thread.sleep(250);
        }

        Imovel imovelEscolhido = null;
        while (imovelEscolhido == null) {

            Thread.sleep(250);

            System.out.println("\nQual a opção que mais te agrada? (Me diz apenas o número.)");
            int opcaoEscolhida = new Scanner(System.in).nextInt();

            Thread.sleep(250);

            if (opcaoEscolhida < 1 || opcaoEscolhida > opcoesViaveis.size()) {
                System.out.println(" > Opção inválida!");
            } else {
                imovelEscolhido = opcoesViaveis.get(opcaoEscolhida - 1);
            }
        }

        System.out.println("\nShow de bola! Agora me diz em quantos meses você quer pagar essa tranqueira:");
        int mesesParaPagamento = new Scanner(System.in).nextInt();

        System.out.printf("\nHumm, certo %s. Você ganha %s e quer financiar um imóvel de %s, no estado %s, pagando em %d meses. Deixa eu ver se é possível...\n\n",
                beneficiario.getNome(),
                DecimalFormat.getCurrencyInstance().format(beneficiario.getSalario()),
                DecimalFormat.getCurrencyInstance().format(imovelEscolhido.getValor()),
                imovelEscolhido.getEndereco().getEstado(),
                mesesParaPagamento);
        Thread.sleep(new Random().nextInt(4000) + 1000);

        PropostaFinanciamento financiamento = new PropostaFinanciamento(beneficiario, imovelEscolhido, mesesParaPagamento);
        financiamento.validarProposta();
    }
}