public class Exemplo2 {
    public static void main(String[] args) throws Exception {

       int n = 0;

       System.out.println("===============NÚMEORS PARES ENTRE 0 E 50===============");

       while (n <= 50) {
            if (n % 2 == 0){ /*ELE VAI DIVIDIR OS NÚMEROS POR 2 ENQUANTO NÃO CHEGAR A 50 */
                System.out.println("NÚMERO PAR: " +n);
            }   
            n++;
       }

    }
}
