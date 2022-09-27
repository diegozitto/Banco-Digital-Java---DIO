package conta;

public interface IConta {
    void depositar(double valor);

    void sacar(double valor);

    void transferir(double valor, Conta contaOrigem, Conta contaDestino);

    void extrato();
}
