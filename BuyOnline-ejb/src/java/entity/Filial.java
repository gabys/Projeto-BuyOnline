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
    
}
