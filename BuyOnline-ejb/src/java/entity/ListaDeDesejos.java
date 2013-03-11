/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.*;

public class ListaDeDesejos {

    @Id
    @GeneratedValue(generator = "CLIENTE_SEQ")
    @SequenceGenerator(name = "CLIENTE_SEQ", allocationSize = 1)
    private long IDListaDeDesejos;
    @OneToMany(mappedBy = "", fetch = FetchType.EAGER)
    private Produto produto;
    @OneToOne(mappedBy = "", fetch = FetchType.EAGER)
    private Cliente cliente;

    public long getIDListaDeDesejos() {
        return IDListaDeDesejos;
    }

    public void setIDListaDeDesejos(long IDListaDeDesejos) {
        this.IDListaDeDesejos = IDListaDeDesejos;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
