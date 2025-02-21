import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Informe o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Informe o número do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Informe o saldo existente na conta: ");
        double saldo = scanner.nextDouble();
        
        System.out.println("==========================DADOS DA CONTA==========================");
        System.out.println("NÚMERO DA CONTA: " + numero);
        System.out.println("NÚEMRO DA AGÊNCIA: "+ agencia);
        System.out.println("NOME DO CLIENTE: " +nomeCliente);
        System.out.println("SALDO DA CONTA: R$ " + saldo);
    }
}
