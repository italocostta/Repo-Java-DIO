package edu.italo.tema.metodos;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume atual: " + smartTv.volume);


        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);
        smartTv.aumentarCanal();
        System.out.println("Novo Status -> Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(7);
        System.out.println("Novo Status -> Canal atual: " + smartTv.canal);
    }
}
