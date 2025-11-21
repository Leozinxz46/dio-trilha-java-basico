package edu.leonardo.metodos;

public class Usuario {
    
    public static void main(String[] args){
        
        smartTv smartTv = new smartTv();
        
        //chamando o metodo para mudar o canal
        smartTv.mudarCanal(12);
        System.out.println("Canal Atual: " + smartTv.canal);


        smartTv.diminuirVolume();//chamando o metodo para diminuir o volume
        smartTv.diminuirVolume();//chamando o metodo para diminuir o volume
        smartTv.aumentarVolume();//chamando o metodo para aumentar o volume

        //status inicial da tv
        System.out.println("Tv Ligada: " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);


        smartTv.ligar ();//chamando o metodo para ligar a tv
        System.out.println("Novo Status da Tv: " + smartTv.ligada);

        smartTv.desligar ();//chamando o metodo para desligar a tv
        System.out.println("Novo Status da TV: " + smartTv.ligada);
    }
}
