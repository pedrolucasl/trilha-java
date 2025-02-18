public class Conta{

/*ATRIBUTOS*/
double saldo = 300;

/*METODOS*/

public void sacar(double valor){

    if (valor <= saldo) {
        System.out.println("OPERAÇÃO NÃO REALIZADA. SALDO INSUFICIENTE!!!");
    } if (valor >=  saldo){
        valor = saldo - valor;
        System.out.println("OPERAÇÃO REALIZADA. SAQUE REALIZADO COM SUCESSO!!!");
    }
}

}