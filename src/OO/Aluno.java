package OO;

public class Aluno {

    public String nome;
    public int nota;
    public boolean situacaoAprovacao;

    // metodo que recebe nome e nota
    public Aluno(String nome, int nota)
    {
        this.nome = nome;
        this.nota = nota;
        // chama o metodo de verificar a nota do aluno aprovado
        this.verifica();
        System.out.println("O aluno " + nome + " foi instanciado com a nota " + nota);
        System.out.println("o aluno está aprovado? " + situacaoAprovacao);

    }

    // metodo para verificar a nota do aluno se esta aprovado
    public void verifica()
    {
        if (nota >= 7)
        {
            situacaoAprovacao = true;

        }

    }

}




