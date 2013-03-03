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
public class ListaDeDesejos {
    
    @Id
    @GeneratedValue(generator = "CLIENTE_SEQ")
    @SequenceGenerator(name = "CLIENTE_SEQ", allocationSize=1)
    private long IDListaDeDesejos;
    
    @OneToMany(mappedBy="", fetch=FetchType.EAGER)
    private Produto produto;
    
    @OneToOne(mappedBy="", fetch=FetchType.EAGER)
    private Cliente cliente;
    
    
    
    
}
