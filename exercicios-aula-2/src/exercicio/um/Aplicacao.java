package exercicio.um;

public class Aplicacao {

    public static void main(String[] args) {
        Diretor diretor1 = new Diretor("J.K", 55, 8, Genero.FEMININO);
        Diretor diretor2 = new Diretor("R.R.Tolkien", 60, 3, Genero.MASCULINO);

        diretor1.imprimir();
        diretor2.imprimir();

        Ator ator1 = new Ator("Leonardo DiCaprio", 42, 8, Genero.MASCULINO);
        Ator ator2 = new Ator("Dakota Fanning", 30, 5, Genero.FEMININO);

        ator1.imprimir();
        ator2.imprimir();

/*
        Filme filme1 = new Filme("Interestelar", "melhor filme", 123, 2014, diretor1);
               //new Diretor("Bruno", 32, 2)); Serve para adicionar o diretor dentro da instância filme.
        filme1.reproduzir();


        Filme filme2 = new Filme("Harry Potter", "História de um jovem bruxo...", 135, 2001, diretor2);
                //new Diretor("J.R", 55, 8)); Serve para adicionar o diretor dentro da instância filme.
        filme2.reproduzir();


 */




    }
}