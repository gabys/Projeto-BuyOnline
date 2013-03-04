/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.*;

/**
 *
 * @author GFactory
 */
public class Estoque {
    
    @Id
    @GeneratedValue(generator = "CLIENTE_SEQ")
    @SequenceGenerator(name = "CLIENTE_SEQ", allocationSize=1)
    private long IDEstoque;
    
    @ManyToMany(mappedBy="", fetch=FetchType.EAGER)
    private Produto produto;
    //TODO - Acertar os mappings da persistence de produto.
    
    @ManyToMany(mappedBy="", fetch=FetchType.EAGER)
    private Filial filial;
    //TODO - Acertar os mappings da persistence da filial.
    
    @Column(length = 32)
    private int qtdEstoque;

    public long getIDEstoque() {
        return IDEstoque;
    }

    public void setIDEstoque(long IDEstoque) {
        this.IDEstoque = IDEstoque;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    
    
}
