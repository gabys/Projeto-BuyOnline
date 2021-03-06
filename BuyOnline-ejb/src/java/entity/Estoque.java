/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.*;

public class Estoque {

    @Id
    @GeneratedValue(generator = "ESTOQUE_SEQ")
    @SequenceGenerator(name = "ESTOQUE_SEQ", allocationSize = 1)

    private long idEstoque;
    @OneToMany (mappedBy = "", fetch = FetchType.EAGER)
    private EstoqueProduto estoqueProduto;
    @OneToOne(mappedBy = "", fetch = FetchType.EAGER)
    private Filial filial;

    public long getIDEstoque() {
        return idEstoque;
    }

    public void setIDEstoque(long IDEstoque) {
        this.idEstoque = IDEstoque;
    }

    public EstoqueProduto getEstoqueProduto() {
        return estoqueProduto;
    }

    public void setEstoqueProduto(EstoqueProduto estoqueProduto) {
        this.estoqueProduto = estoqueProduto;
    }

    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }
}
