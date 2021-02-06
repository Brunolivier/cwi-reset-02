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

    }

}
