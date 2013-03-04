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
public class Filial {
    
    @Id
    @GeneratedValue(generator = "FILIAL_SEQ")
    @SequenceGenerator(name = "FILIAL_SEQ", allocationSize=1)
    private long IDProduto;
    
    @Column(length = 32)
    private int CNPJ;
    
    @OneToMany(cascade=CascadeType.PERSIST)
    private Endereco endereco;
    
    @ManyToMany(mappedBy="", fetch=FetchType.EAGER)
    private Estoque estoque;

    public long getIDProduto() {
        return IDProduto;
    }

    public void setIDProduto(long IDProduto) {
        this.IDProduto = IDProduto;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }
    
    
   
}
