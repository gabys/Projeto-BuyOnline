/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.*;

public class EstoqueProduto {

    public EstoqueProduto(Estoque estoque,
            Produto produto,
            int quantidade) {
        this.estoque = estoque;
        this.produto = produto;
        this.quantidade = quantidade;
    }
    @Id
    @GeneratedValue(generator = "ESTOQUEPRODUTO_SEQ")
    @SequenceGenerator(name = "ESTOQUEPRODUTO_SEQ", allocationSize = 1)
    private long idEstoqueProduto;
    @OneToOne(mappedBy = "", fetch = FetchType.EAGER)
    private Estoque estoque;
    @OneToOne(mappedBy = "", fetch = FetchType.EAGER)
    private Produto produto;
    @OneToOne(mappedBy = "", fetch = FetchType.EAGER)
    private int quantidade;

    public long getIdEstoqueProduto() {
        return idEstoqueProduto;
    }

    public void setIdEstoqueProduto(long idEstoqueProduto) {
        this.idEstoqueProduto = idEstoqueProduto;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
