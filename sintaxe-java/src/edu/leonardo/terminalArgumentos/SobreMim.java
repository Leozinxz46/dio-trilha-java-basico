package edu.leonardo.terminalArgumentos;

public class SobreMim {
    public static void main(String[] args) {
        //os argumentos começam com indice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); 
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");

        // Este programa pega informações digitadas no terminal (nome, sobrenome, idade e altura)
        // e mostra na tela.
        // Os valores digitados no terminal ficam dentro do "args", que é uma lista de palavras.
        // args[0] = primeiro valor digitado (nome)
        // args[1] = segundo valor digitado (sobrenome)
        // args[2] = terceiro valor digitado (idade) → convertido para número inteiro (int)
        // args[3] = quarto valor digitado (altura) → convertido para número decimal (double)
        // Depois, o programa imprime tudo formatado no console.

    }
}

