package conta;

import cliente.Cliente;
import lombok.Getter;

import java.io.PrintStream;
import cliente.Cliente;
import conta.Conta;


@Getter
public class FuncionalidadesConta implements IConta{

     Cliente cliente = new Cliente();


    protected double saldo = 0.0d ;

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }


    @Override
    public void sacar(double valor) {

        if (valor <= this.saldo && this.saldo >= 0.0) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Valor de saque inválido!!");
        }

    }

    /**
     * @param valor
     * @param contaOrigem, será realizado um saque
     * @param contaDestino, será feito um depósito
     */
    @Override
    public void transferir(double valor, Conta contaOrigem, Conta contaDestino) {

       if(contaOrigem.getSaldo() >= valor && contaOrigem.getSaldo()>0){
           contaOrigem.sacar(valor);
           contaDestino.depositar(valor);
           System.out.println("Transferência de: R$ " + String.format("%.2f", valor) + " realizado com sucesso para: " + contaDestino.getCliente());
       } else {
           System.out.println("Falha na transferência reveja seu saldo ou entre em contato com seu banco");
       }

    }

    /**
     Principais informações da conta: Nome do titular,
     Agência, Número da conta, saldo
     */
    @Override
    public void extrato() {
        System.out.println("Nome titular: "  + getCliente().getNome() );
        System.out.println("Saldo em conta: R$ " + String.format("%.2f", getSaldo()) );
    }


}
