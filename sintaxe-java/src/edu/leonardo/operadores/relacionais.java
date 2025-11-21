package edu.leonardo.operadores;

public class relacionais {
    public static void main(String[] args) {

        int numero1 = 3;
        int numero2 = 5;

        //igualdade
        boolean simNao = numero1 == numero2;
        System.out.println(simNao);

        //diferente
        boolean simNao2 = numero1 != numero2;
        System.out.println(simNao2);

        //maior
        boolean simNao3 = numero1 > numero2;
        System.out.println(simNao3);

        //maior ou igual
        boolean simNao4 = numero1 >= numero2;
        System.out.println(simNao4);

        //menor
        boolean simNao5 = numero1 < numero2;
        System.out.println(simNao5);

        //menor ou igual
        boolean simNao6 = numero1 <= numero2;
        System.out.println(simNao6);


//////////////////////////////////////////////////////////////
/// EXEMPLO COM if/else
        if (numero1 < numero2){
            System.out.println("A condição é verdadeira");
        } else {
            System.out.println("A condição é falsa");
        }


///////////////////////////////////////////////////////////////
/// EXEMPLO COM STRING
        String nome1 = "Leonardo";
        String nome2 = "Leonardo";

        boolean simNao7 = nome1 == nome2;
        System.out.println(simNao7);


/// *MELHOR JEITO DE COMPARAR STRINGS*
        boolean simNao8 = nome1.equals(nome2);
        //equals > esse metodo compara o conteudo se sao iguias ou nao
        System.out.println(simNao8);


    }
}
