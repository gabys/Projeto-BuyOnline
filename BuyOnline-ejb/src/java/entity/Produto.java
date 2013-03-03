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
public class Produto {
    
    @Id
    @GeneratedValue(generator = "PRODUTO_SEQ")
    @SequenceGenerator(name = "PRODUTO_SEQ", allocationSize=1)    
    private long IDProduto;
    
    @Column(length = 32)
    private String descricao;
    
    @Column(length = 32)
    private String preco;
    //TODO - Verificar a melhor forma de manipular moeda no JAVA.
    
    @ManyToMany(mappedBy="", fetch=FetchType.EAGER)
    private Estoque estoque;
    //TODO - Acertar os mappings da persistence de estoque.

    public long getIDProduto() {
        return IDProduto;
    }

    public void setIDProduto(long IDProduto) {
        this.IDProduto = IDProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }
    
   
}
