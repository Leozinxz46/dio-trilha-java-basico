package edu.leonardo.anatomiaDasClasses;
public class MinhaClasse3 {


///EXEMPLO DE MÉTODO:

public static void main (String[] args) {

    String primeiroNome = "Leonardo";
    String segundoNome = "Silva";

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

    System.out.println(nomeCompleto);

}


    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do Metodo " + primeiroNome.concat(" ").concat(segundoNome);

    }


}
