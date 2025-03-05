import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
       
      selecaoCandidatos();

    }
      static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0; /*CONTADOR DE CADIDATOS */
        int candidatoAtual = 0; /*INDICE DO ARRAY */
        double salarioBase = 2200.0;

        while (candidatosSelecionados < 5) { /*ENQUANTO A SELEÇÃO FOR MENOR QUE 5, ELE IRÁ RODAR O WHILE */
          String candidato = candidatos[candidatoAtual]; /*VARIVAEL STRING (CANDIDATO) RECEBE O INDICE DO ARRAY (POSIÇÃO ATUAL) */
          double salarioPretendido = valorPretendido();

          System.out.println("O candidato " + candidato + " solicitou este valor de salário: R$" +salarioPretendido);
           if (salarioBase >= salarioPretendido) {
          candidatosSelecionados++; /*APÓS O "IF" CERTIFICAR QUE FOI VERDADEIRO, ELE PASSARÁ PARA OUTRO CONDIDATO E REALIZARÁ UMA NOVA ANALISE */
          System.out.println("O candidato " + candidato+ " foi selecionado para a vaga");
          } else{
            System.out.println("CANDIDATO: " +candidato+ "NÃO SELECIONADO");
          }
          candidatoAtual++;
        }
      }
      
      static double valorPretendido(){
          return ThreadLocalRandom.current().nextDouble(1800, 2200);
      }

      static void analisarCandidato(double salarioPretendido) {

        double salarioBase = 2000.00;

        if (salarioBase > salarioPretendido){
          System.out.println("LIGAR PARA CANDIDATO");
        }
         else if (salarioBase == salarioPretendido) {
          System.out.println("ENTRAR EM CONTATO PARA CONTRA PROPOSTA");
        } 
        else {
          System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
      
    }

} 