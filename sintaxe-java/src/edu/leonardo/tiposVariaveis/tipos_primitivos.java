package edu.leonardo.tiposVariaveis;
public class tipos_primitivos {
    public static void main(String[] args) {
        
        //Tipos primitivos em java:

        byte idade = 15;
        short ano = 2015;

        int quantidade = 1500;
        //Se INT comecar com 0 ele entende que é um numero octal, sendo assim o valor seria uma string nao um INT]
        // Exemplo:
        int cep = 01234567;

        //Lomg sempre fecha sua variavel com L
        //float sempre fecha sua variavel com F
        //Exemplo:
        long cpf = 123875790231L;
        float pi = 3.14F;

        double salario = 1235.50;

        ///Exibindo os valores na tela

        System.out.println(idade);
        System.out.println(ano);
        System.out.println(quantidade);
        System.out.println(cep);
        System.out.println(cpf);
        System.out.println(pi);
        System.out.println(salario);
    }
}