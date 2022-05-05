package Banco_Digital.Util;

import Banco_Digital.Contas.Conta;

public interface ContaInterface {

    void sacar(double valor);
    void depositar(double valor);
    void transferir(Conta contaDestino, double valor);
    void imprimirExtrato();
}
