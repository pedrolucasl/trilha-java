import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) throws Exception {

            Scanner scanner = new Scanner(System.in);
            int soma = 0;

            System.out.println("Digite 10 números inteiros:");

            for (int i = 1; i<=10; i++){

                System.out.print("Número " + i + ": ");
                int numero = scanner.nextInt();
                soma += numero;
            }
            System.out.println("A soma total é: " + soma);
            scanner.close();
        }

    }

