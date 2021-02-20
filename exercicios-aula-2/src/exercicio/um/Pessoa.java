package exercicio.um;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private Genero genero;

    public Pessoa(String nome, LocalDate dataNascimento, Genero genero) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    LocalDate getDataNascimento = LocalDate.parse("dd-MM-yyyy",formatter));


    public void imprimirDados (){
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + dataNascimento);
    }

    public String getNome() {
        return nome;
    }
}