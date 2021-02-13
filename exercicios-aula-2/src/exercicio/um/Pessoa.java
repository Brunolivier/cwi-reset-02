package exercicio.um;

public class Pessoa {
    private String nome;
    private int idade;
    private Genero genero;


    public Pessoa(String nome, int idade, Genero genero) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimirDados (){
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    }

    public String getNome() {
        return nome;
    }
}