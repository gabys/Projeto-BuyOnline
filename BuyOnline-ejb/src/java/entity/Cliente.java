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
    @SequenceGenerator(name = "CLIENTE_SEQ", allocationSize = 1)
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
    @OneToMany(cascade = CascadeType.PERSIST)
    private Endereco endereco;
    @OneToOne(optional = true)
    private Carrinho carrinho;
    @OneToOne(optional = true)
    private ListaDeDesejos listadedesejos;
    
    
    public long getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(long IDCliente) {
        this.IDCliente = IDCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public ListaDeDesejos getListadedesejos() {
        return listadedesejos;
    }

    public void setListadedesejos(ListaDeDesejos listadedesejos) {
        this.listadedesejos = listadedesejos;
    }
}