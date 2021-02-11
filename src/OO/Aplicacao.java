package OO;

import com.sun.org.apache.xpath.internal.operations.Div;

public class Aplicacao {

    public static void main(String[] args)
    {
        Calculadora calculadora = new Calculadora();
        int Soma = calculadora.soma(2,4);
        System.out.println(Soma);

        int Subtrai = calculadora.subtrai(2,4);
        System.out.println(Subtrai);

        int Multiplica = calculadora.multiplica(2,4);
        System.out.println(Multiplica);

        int Divide = calculadora.divide(2,4);
        System.out.println(Divide);

        Comparador comparador = new Comparador();
        boolean MenorQue = comparador.menorQue(2,4);
        System.out.println(MenorQue);

        Aluno aluno1 = new Aluno("Bruno", 7);
        System.out.println(aluno1);

        Aluno aluno2 = new Aluno("Leandro", 8);
        System.out.println(aluno2);

        Aluno aluno3 = new Aluno("Pereira", 6);
        System.out.println((aluno3));

    }

}
