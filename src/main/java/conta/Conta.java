package conta;

import cliente.Cliente;
import lombok.Getter;

@Getter
public class Conta extends FuncionalidadesConta{

    protected final int numeroAgencia = 18;
    protected int numeroConta;

    protected static int quantidadeContas = 1;

    /**
     Toda conta tem um cliente, pois não é possível ser um Cliente sem ter uma conta.
     */
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.numeroConta = quantidadeContas++;
        this.cliente = cliente;
    }

}
