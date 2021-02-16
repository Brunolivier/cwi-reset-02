package exercicio.um;
public class Filme {
    private Diretor diretor;
    private String nome;
    private String descricao;
    private double duracao;
    private double ano;
    private int nota;


    public Filme(String nome, String descricao, double duracao, double ano, int nota, Diretor diretor) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.ano = ano;
        this.nota = nota;
        this.diretor = diretor;
    }

    public void reproduzir() {
        System.out.println("O nome do filme é " + this.nome);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Duração: " + this.duracao);
        System.out.println("Nota: " + this.nota);
        System.out.println("Diretor: " + this.diretor.getNome());
    }

    /*
    public void nota() {

        if (nome == "O clube da luta")
        {
            nota = 5;
        }
        else if (nome == "Batman vs Superman")
        {
            nota = 1;
        }
        else if (nota < 1 || nota > 5)
        {
            nota = 3;
        }
        else
        {
            nota = nota;
        }

     */

}


