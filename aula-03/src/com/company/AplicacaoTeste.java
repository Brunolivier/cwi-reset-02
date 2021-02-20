package com.company;

import com.company.domain.Editora;
import com.company.exceptions.EditoraExceptions;

public class AplicacaoTeste {

    public static void main(String[] args) {

        Editora editora0 = new Editora("Capcom", "BRA");
        System.out.println("Editora: " + editora0.getNome());

        Editora editora2 = new Editora("Marvel", "EUA");
        System.out.println("Editora: " + editora2.getNome());

        Editora editora1 = new Editora("DC Comics", "EUA");
        System.out.println("Editora: " +editora2.getNome());


    }

}
