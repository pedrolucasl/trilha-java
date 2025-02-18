public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smt =  new SmartTv();

        System.out.println("A SmartTV está ligada?: " + smt.ligada);
        System.out.println("Qual o volume atual da TV?" + smt.volume);
        System.out.println("Qual o canal atual que a TV se encontra?: " + smt.canal);


        smt.ligar();
        smt.mudarCanal(10);
        smt.aumentarVolume();
        

    }
}
