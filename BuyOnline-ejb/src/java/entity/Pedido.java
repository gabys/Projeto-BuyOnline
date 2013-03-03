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
public class Pedido {
    
    @Id
    @GeneratedValue(generator = "CLIENTE_SEQ")
    @SequenceGenerator(name = "CLIENTE_SEQ", allocationSize=1)
    private long IDPedido;
    
    @OneToMany(mappedBy="", fetch=FetchType.EAGER)
    private Produto produto;
    
    @Column(length = 32)
    private boolean statusPagamento;
    
    @Column(length = 32)
    private boolean statusEntrega;
}
