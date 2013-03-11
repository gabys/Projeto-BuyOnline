/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.*;

public class Carrinho {

    @Id
    @GeneratedValue(generator = "CARRINHO_SEQ")
    @SequenceGenerator(name = "CARRINHO_SEQ", allocationSize = 1)
    private long idCarrinho;
    @OneToOne(mappedBy = "", fetch = FetchType.EAGER)
    private Cliente cliente;
    @OneToMany(mappedBy = "", fetch = FetchType.EAGER)
    private Produto produto;

    public long getIDCarrinho() {
        return idCarrinho;
    }

    public void setIDCarrinho(long IDCarrinho) {
        this.idCarrinho = IDCarrinho;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
