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
public class Carrinho {
    
    @Id
    @GeneratedValue(generator = "CLIENTE_SEQ")
    @SequenceGenerator(name = "CLIENTE_SEQ", allocationSize=1)
    private long IDCarrinho;
    
    @OneToMany(mappedBy="", fetch=FetchType.EAGER)
    private Produto produto;

    public long getIDCarrinho() {
        return IDCarrinho;
    }

    public void setIDCarrinho(long IDCarrinho) {
        this.IDCarrinho = IDCarrinho;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
}
