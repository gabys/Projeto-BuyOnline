/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.*;

public class Filial {

    @Id
    @GeneratedValue(generator = "FILIAL_SEQ")
    @SequenceGenerator(name = "FILIAL_SEQ", allocationSize = 1)
    private long idFilial;
    @Column(length = 32)
    private int cnpj;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Endereco endereco;
    @OneToMany(mappedBy = "", fetch = FetchType.EAGER)
    private Estoque estoque;

    public long getIDFilial() {
        return idFilial;
    }

    public void setIDFilial(long IDFilial) {
        this.idFilial = IDFilial;
    }
    
    public int getCNPJ() {
        return cnpj;
    }

    public void setCNPJ(int CNPJ) {
        this.cnpj = CNPJ;
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
