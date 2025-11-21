package edu.leonardo.operadores;

public class fluxo_repeticao {

    public static void main(String[] args) {
        int numeros = 5;
        // X repeticao

        // incrementando algun valor numerico a variavel 'numeros'
        //segestoes de incremento 
        numeros = numeros + 2;// jeito comum
        numeros += 3; // jeito simplificado

        numeros++; // jeito simplificado de incrementar apenas funcional com o valor '1'


        System.out.println(numeros);


////////////////////////////////////////////////////////////////////////////////////////////////////
        
        // decrementando algun valor numerico a variavel 'numeros'
        //segestoes de decremento 
        numeros = numeros - 2;// jeito comum
        numeros -= 3; // jeito simplificado

        numeros--; // jeito simplificado de decrementar apenas funcional com o valor '1'

        System.out.println(numeros);
    }
}
