/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.*;

public class Produto {

    @Id
    @GeneratedValue(generator = "PRODUTO_SEQ")
    @SequenceGenerator(name = "PRODUTO_SEQ", allocationSize = 1)

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.88DF4BD6-A8DD-AADA-18F8-6388D509F76E]
    // </editor-fold> 
    private Estoque estoque;
    private long idProduto;
    @Column(length = 32)
    private String descricao;
    @Column(length = 32)
    private String preco;

    public long getIDProduto() {
        return idProduto;
    }

    public void setIDProduto(long IDProduto) {
        this.idProduto = IDProduto;
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

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.38689735-9BEA-624C-5475-C3C6542E1A7A]
    // </editor-fold> 
    public Estoque getEstoque () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2DF505C1-4F44-EE09-9C50-F04500DBAC38]
    // </editor-fold> 
    public void setEstoque (Estoque estoque) {
    }
}
