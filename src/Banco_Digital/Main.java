package Banco_Digital;

import Banco_Digital.Contas.Conta;
import Banco_Digital.Contas.ContaCorrente;
import Banco_Digital.Contas.ContaPoupanca;
import Banco_Digital.Util.Banco;
import Banco_Digital.Util.Cliente;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco("ITAU");

        Cliente gabriel = new Cliente("Gabriel");
        Cliente julio = new Cliente("Julio");

        Conta cc = new ContaCorrente(gabriel);
        Conta cop = new ContaPoupanca(julio);

        banco.mostrarClientes();

        cc.depositar(100);
        cc.transferir(cop, -70);

        cc.imprimirExtrato();
        cop.imprimirExtrato();
    }
}
