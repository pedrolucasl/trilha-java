public class SmartTv{

    boolean ligada = false;
    int volume = 22;
    int canal = 1;
    
    //MÉTODOS REFERENTES A VARIÁVEL CANAL//

    public void mudarCanal (int mudarCanal){
        canal = mudarCanal;
        System.out.println("Canal atual -> " + canal);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Canal atual -> " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Canal atual -> " + canal);
    }

    //METODOS REFERENTES AO ESTADO ATUAL DA TV

    public void ligar() {
        ligada = true;
        System.out.println("TV LIGADA NO MOMENTO");
    }
    public void desligar() {
        ligada = false;
        System.out.println("TV DESLIGADA NO MOMENTO");
    }

    //METODOS REFERENTES A VARIÁVELVOLUME

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume atual -> " + volume);
    }

    public void diminuirVolume(){
        volume --;
        System.out.println("Volume atual -> " + volume);
    }
}