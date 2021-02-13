package exercicio.um;
public class Filme {
    private Diretor diretor;
    private String nome;
    private String descricao;
    private double duracao;
    private double ano;
    private int nota;


    public Filme(String nome, String descricao, double duracao, double ano, Diretor diretor) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.ano = ano;
        this.diretor = diretor;
    }

    public void reproduzir() {
        System.out.println("O nome do filme é " + this.nome);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Duração: " + this.duracao);
        System.out.println("Diretor: " + this.diretor.getNomeDiretor());
    }




}
