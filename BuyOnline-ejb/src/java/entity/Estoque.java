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
    
}
