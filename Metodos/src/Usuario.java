public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("Está ligada? " + smartTv.ligada);
        System.out.println("Qual o canal atual? " + smartTv.canal);
        System.out.println("Qual o volume? " + smartTv.volume);

        SmartTv smartTv1 = new SmartTv();
        smartTv1.setLigada(true);
        smartTv1.setCanal(30);
        smartTv1.setVolume(50);

        System.out.println("Está ligada? " + smartTv1.ligada);
        System.out.println("Qual o canal atual? " + smartTv1.canal);
        System.out.println("Qual o volume? " + smartTv1.volume);

        SmartTv smartTv2 = new SmartTv();
        smartTv2.setCanal(35);
        smartTv2.setVolume(59);
        smartTv2.aumentarVolume();
        smartTv2.aumentarVolume();
        smartTv2.desligar();
        //Agora vou ligar
        smartTv2.ligar();

        System.out.println("Está ligada? " + smartTv2.ligada);
        System.out.println("Qual o canal atual? " + smartTv2.canal);
        System.out.println("Qual o volume? " + smartTv2.volume);

        //-------------------------------------------------//

        SmartTv smartTv3 = new SmartTv();

        smartTv3.ligar();
        smartTv3.aumentarVolume();
        smartTv3.setarCanal(30);

        System.out.println("Está ligada? " + smartTv3.ligada);
        System.out.println("Qual o canal atual? " + smartTv3.canal);
        System.out.println("Qual o volume? " + smartTv3.volume);


    }
}
