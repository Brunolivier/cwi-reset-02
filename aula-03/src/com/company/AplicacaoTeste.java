package com.company;

import com.company.domain.Editora;
import com.company.domain.Filme;
import com.company.enumeradores.Genero;
import com.company.exceptions.EditoraExceptions;
import com.company.heranca.Diretor;

public class AplicacaoTeste {

    public static void main(String[] args) throws IllegalAccessException {
/*
        Editora editora0 = new Editora("Capcom", "BRA");
        System.out.println("Editora: " + editora0.getNome());

        Editora editora2 = new Editora("Marvel", "EUA");
        System.out.println("Editora: " + editora2.getNome());

        Editora editora1 = new Editora("DC Comics", "EUA");
        System.out.println("Editora: " +editora2.getNome());
        
 */

        Diretor diretor = new Diretor("J.K",65,8, Genero.FEMININO);
        Filme filme1 = new Filme("Harry Potter", "melhor filme", 180, 2003, 6, diretor);



    }

}
