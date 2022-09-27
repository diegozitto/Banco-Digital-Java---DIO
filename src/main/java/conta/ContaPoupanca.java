package conta;

import cliente.Cliente;

public class ContaPoupanca extends Conta{

    protected Conta contaPoupanca;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void extrato (){
        System.out.println("==============EXTRATO CONTA POUPANCA==============");
        super.extrato();
        System.out.println("Agência: " + super.numeroAgencia);
        System.out.println("Número da conta: " + super.numeroConta);


    }
}
