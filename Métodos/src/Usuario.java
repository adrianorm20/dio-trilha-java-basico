public class Usuario {
    
    public static void main(String[] args) throws Exception {
        Metodos smartTv = new Metodos();
      
        System.out.println("Canal Atual : "+smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual : "+smartTv.canal);
        
        smartTv.diminuirVolume();
        System.out.println("Valor Atual : " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Valor Atual : " + smartTv.volume);
        
        smartTv.ligar ();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status -> TV Desligada? " + smartTv.ligada);
         
    }
}
