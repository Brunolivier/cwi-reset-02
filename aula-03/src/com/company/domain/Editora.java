package com.company.domain;

import com.company.exceptions.EditoraExceptions;

public class Editora {
    private String nome;
    private String localizacao;


    public Editora(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
        verificarNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }


    private void verificarNome(String nome){
        if(nome.equals("DC Comics")){
            throw new EditoraExceptions("DC SUX! Troca de editora.");
        }
    }







}
