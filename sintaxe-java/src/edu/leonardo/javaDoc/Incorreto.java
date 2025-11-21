package edu.leonardo.javaDoc;

public class Incorreto {

    /*
     * ⚠️ Atenção:
     * Este código é um exemplo de como NÃO devemos programar.
     * Comentários não servem para tapar buracos de código mal escrito.
     * Nome ruim, método confuso ou lógica pouco clara devem ser corrigidos,
     * não “explicados” com comentários.
     * Código limpo se entende sozinho — não dependa de comentários para isso.
     * Aqui a variável também está mal interpretada, reforçando o problema.
     */

    public int somaMultiplica(int n, int x, String m) {
        // exemplo ruim de nome + comentário desnecessário

        int r = 0; // r é igual resultado
        if (m == "M") { //M = multiplicaçao
            r = n * x;
        } else {
            // se não soma mesmo
            r = n + x;
        }
        return r;
    }
}

