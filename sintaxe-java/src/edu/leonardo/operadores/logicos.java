package edu.leonardo.operadores;

public class logicos {
    public static void main(String[] args) {


        //EXEMPLO 1
        boolean condicao1 = true;
        boolean condicao2 = true;

        //O operador && so retorna true se as duas condicoes forem verdadeiras
        //Caso uma seja falsa, o print não sera exibido
        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }

////////////////////////////////////////////////////////////////////////////////////////

        //EXEMPLO 2
        boolean condicao3 = true;
        boolean condicao4 = false;

        //O operador || retorna true se Uma Das Condicoes Corem VERDADEIRAS
        //Caso as duas sejam falsas, o print nao sera exibido
        if (condicao3 || condicao4) {
            System.out.println("Uma das condições é verdadeira");
        }

/////////////////////////////////////////////////////////////////////////////////////

        //EXEMPLO 3

        //Metodo relacional dentro de uma condicao logica
        if (condicao1 && (7 > 4)) {
            System.out.println("As duas condições são verdadeiras");
        }

    }
}