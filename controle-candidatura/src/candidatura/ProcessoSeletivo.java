package candidatura;

import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        
      System.out.println("=====================PROCESSO SELETIVO=====================");

      Scanner scanner = new Scanner (System.in);

      System.out.println("CANDIDATO, INFORME O SALÁRIO PRETENDIDO");
      double teste = scanner.nextDouble();

      analisarCandidato(teste);

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