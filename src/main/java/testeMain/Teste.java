package testeMain;

import cliente.Cliente;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

public class Teste {
    public static void main(String[] args) {


        Cliente marvel = new Cliente();
        marvel.setNome("Marvel");

        Cliente dc = new Cliente();
        dc.setNome("DC Comics");
        /**
         * Ao inicializar uma conta (de qualquer tipo), ela já fica associado a um cliente (este deve ser
         * declarado antecedendo a declaração da conta).
         */
        Conta cM = new ContaCorrente(marvel);
        Conta cD = new ContaCorrente(dc);

        System.out.println("Nome do titular: " + marvel.getNome() +
                           " |---| Token de segurança: " + marvel.getToken());

        System.out.println("Nome do titular: " + dc.getNome() +
                           " |---| Token de segurança: " + dc.getToken());

        System.out.println(marvel.getClass() + " |---| " + dc.getClass());

        /**
         * Métodos e saídas da classe Cliente funcionando perfeitamente
         */
        cM.depositar(500000000);
        cM.extrato();

        System.out.println(" ");
        cM.transferir(20000000, cM, cD);
        System.out.printf("Seu saldo é de R$ " + "%.2f", cM.getSaldo());

        System.out.println(" ");
        cM.sacar(8000000);
        System.out.printf("Seu saldo é de R$ " + "%.2f", cM.getSaldo());

        System.out.println(" ");
        cD.depositar(500000000);
        cD.extrato();




    }
}
