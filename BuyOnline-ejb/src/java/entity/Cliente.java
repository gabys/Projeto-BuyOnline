/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import ejbStateless.ListaDeDesejosBean;
import javax.persistence.*;

/**
 *
 * @author GFactory
 */
public class Cliente {
    
    @Id
    @GeneratedValue(generator = "CLIENTE_SEQ")
    @SequenceGenerator(name = "CLIENTE_SEQ", allocationSize=1)
    private long IDCliente;
    
    @Column(length = 32)
    private String nome;
    
    @Column(unique = true, length = 64)
    private String email;
    
    @Column(length = 32)
    private String senha;
    
    @Column(length = 32)
    private String Telefone;
    
    @Column(unique = true, length = 11)
    private String CPF;
    
    @OneToMany(cascade=CascadeType.PERSIST)
    private Endereco endereco;
    
    @OneToOne(optional=true)
    private Carrinho carrinho;
    
    @OneToOne(optional=true)
    private ListaDeDesejos listadedesejos;
    
}