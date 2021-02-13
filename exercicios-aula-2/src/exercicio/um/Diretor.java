package exercicio.um;

public class Diretor {
    private String nomeDiretor;
    private Genero genero;
    private int idade;
    private int quantidadeFilmesDirigidos;

    public Diretor(String nomeDiretor, int idade, int quantidadeFilmesDirigidos, Genero genero) {
        this.nomeDiretor = nomeDiretor;
        this.idade = idade;
        this.quantidadeFilmesDirigidos = quantidadeFilmesDirigidos;
        this.genero = genero;
    }

    public String getNomeDiretor() {

        return nomeDiretor;
    }

    public void imprimir() {
        System.out.println("Nome do diretor é: " + this.nomeDiretor);
        System.out.println("A idade do diretor é: " + this.idade);
        System.out.println("O genêro é: " + this.genero.getDescricao());
    }


}




