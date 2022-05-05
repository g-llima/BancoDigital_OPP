package Banco_Digital.Util;

public class Cliente {

    private String nome;

    public Cliente(String nomeCliente) {
        this.nome = nomeCliente;
        Banco.clientesLista.add(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
