public class teste {
    public static void main(String[] args) {
     
        double saldo = 25;
        double valorSolicitado = 18;

        System.out.println("SALDO ATUAL: " + saldo);

        if (saldo > valorSolicitado){
            saldo -= valorSolicitado;
            System.out.println("SAQUE REALIZADO!");
        }
            else{
                System.out.println("SALDO INSUFUCIENTE");

            }
        
         System.out.println("SALDO ATUAL: " +saldo);

    } }

    

