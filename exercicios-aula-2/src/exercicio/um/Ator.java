package exercicio.um;
public class Ator {
    private Genero genero;
    private String nome;
    private int idade;
    private int quantidadeOscarVencido;


    public Ator(String nome, int idade, int quantidadeOscarVencido, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.quantidadeOscarVencido = quantidadeOscarVencido;
        this.genero = genero;
       ;
    }

    public void imprimir() {
        System.out.println("Nome do ator é: " + this.nome);
        System.out.println("A idade do ator é: " + this.idade);
        System.out.println("O genêro é: " + this.genero.getDescricao());
    }




}
