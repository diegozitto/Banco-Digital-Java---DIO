package conta;

import cliente.Cliente;

public class ContaCorrente extends Conta {

    protected Conta contaCorrente;
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void extrato (){
        System.out.println("==============EXTRATO CONTA CORRENTE==============");
        super.extrato();
        System.out.println("Agência: " + super.numeroAgencia);
        System.out.println("Número da conta: " + super.numeroConta);

    }
}
