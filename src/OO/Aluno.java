package OO;

public class Aluno {

    public String nome;
    public int nota;
    public boolean situacaoAprovacao;

    public Aluno(String nome, int nota)
    {
        this.nome = nome;
        this.nota = nota;
        this.verifica();
        System.out.println("O aluno " + nome + " foi instanciado com a nota " + nota);
        System.out.println("o aluno está aprovado? " + situacaoAprovacao);

    }

    public void verifica()
    {
        if (nota >= 7)
        {
            situacaoAprovacao = true;

        }

    }

}




