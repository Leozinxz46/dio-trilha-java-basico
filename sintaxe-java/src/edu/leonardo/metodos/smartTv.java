package edu.leonardo.metodos;

public class smartTv {
    boolean ligada = true;
    int canal = 5;
    int volume = 25;


    //metodo para mudar canal
public void mudarCanal(int novoCanal){
    canal = novoCanal;
    }
//metodo para aumentar canal
    public void aumentarCanal(){
        canal++;
    }
    //metodo para diminuir canal
    public void diminuirCanal(){
        canal--;
    }


    //metodo para aumentar volume
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    //metodo para diminuir volume
    public void diminuirVolume(){
        volume--;
        System.out.println("diminuido o volume para: " + volume);
    }


    //metodo para ligar a tv
    public void ligar(){
        ligada = true;
    }
    //metodo para desligar a tv
    public void desligar(){
        ligada = false;
    }

}