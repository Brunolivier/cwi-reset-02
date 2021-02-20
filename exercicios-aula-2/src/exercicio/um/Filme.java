package exercicio.um;

import com.sun.javaws.IconUtil;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class Filme {
    private Diretor diretor;
    private String nome;
    private String descricao;
    private double duracao;
    private double ano;
    private int nota;


    public Filme(Diretor diretor, String nome, String descricao, double duracao, double ano, int nota, ArrayList<String> elenco) {
        this.diretor = diretor;
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.ano = ano;
        this.nota = nota;
        this.elenco = elenco;
    }

    public void reproduzir() {
        System.out.println("O nome do filme é " + this.nome);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Duração: " + this.duracao);
        System.out.println("Nota: " + this.nota);
        System.out.println("Diretor: " + this.diretor.getNome());
    }

    public String exibirCreditos (){
        //TODO implementar comportamento de exibir informacoes
    }

    String elenco1 = "Bruno, Leticia, Laura, Andre";
    String elenco2 = "Tasley, Diego, Isabella, Laiz";

    ArrayList<String> elenco = new ArrayList<>();


/*
    for(String elenco : elenco){
        elenco.add("Bruno");
        elenco.add("Leticia");
        elenco.add("Laura");
        elenco.add("Andre");
        elenco.add("Diego");
        elenco.add("Laiz");
        elenco.add("Tasley");
        elenco.add("Isabella");
        System.out.println("elenco: " + elenco);
    }

 */






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


