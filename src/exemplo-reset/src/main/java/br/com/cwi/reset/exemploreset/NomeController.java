package br.com.cwi.reset.exemploreset;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.*;

@RestController
public class NomeController {


    private static String nome = "Bruno";

    @GetMapping("/nome")
    public String nome(){
        return nome;
    }

    @PutMapping("nome/{novoNome}")
    public String mudarNome(@PathVariable String novoNome){
        this.nome = novoNome;
        return this.nome;
    }

    @DeleteMapping("/nome")
    public String deleteNome(){
        this.nome = null;
        return "Apagado com sucesso";
    }



}
