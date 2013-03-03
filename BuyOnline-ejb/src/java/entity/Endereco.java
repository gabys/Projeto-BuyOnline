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
public class Endereco {
    
    @Id
    @GeneratedValue(generator = "CLIENTE_SEQ")
    @SequenceGenerator(name = "CLIENTE_SEQ", allocationSize=1)
    private long IDEndereco;
    
    @Column(length = 32)
    private String logradouro;
    
    @Column(length = 32)
    private String complemento;
    
    @Column(length = 32)
    private int numero;
    
    @Column(length = 32)
    private String CEP;
    
}
