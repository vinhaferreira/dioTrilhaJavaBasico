public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        smartTv.mudarCanal(13);
        smartTv.diminuirCanal();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual : " + smartTv.volume);
        
        System.out.println("Tv ligada ? " + smartTv.ligada);
        System.out.println("Canal autal : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Novo Status - : TV Ligada ? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo Status - : TV Ligada ? " + smartTv.ligada);
             

    
    }
}
