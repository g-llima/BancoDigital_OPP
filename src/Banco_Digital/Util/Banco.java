package Banco_Digital.Util;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    protected static List<String> clientesLista = new ArrayList<>();

    public Banco(String nomeBanco) {
        this.nome = nomeBanco;
    }

    public void mostrarClientes() {
        System.out.println("====\tCLIENTES DO " + this.nome + "\t====");
        System.out.println(clientesLista.toString());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
