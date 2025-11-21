package edu.leonardo.operadores;
public class ternarios {
    static public void main(String[] args) {
    int a, b;

    a = 5;
    b = 6;

    // Usando operadores If-Else
    String resultado = "";
    if(a == b)
        resultado = "verdadeiro";
    else
        resultado = "falso";

        System.out.println(resultado);
///////////////////////////////////////////////////////////////

    // Usando Operador Ternario
    String resultado2 = (a == b) ? "verdadeiro" : "falso";

    System.out.println(resultado2);
    }
}