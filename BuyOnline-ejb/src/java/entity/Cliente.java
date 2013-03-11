/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.*;

public class Cliente {

    @Id
    @GeneratedValue(generator = "CLIENTE_SEQ")
    @SequenceGenerator(name = "CLIENTE_SEQ", allocationSize = 1)

    private long idCliente;
    @Column(length = 32)
    private String nome;
    @Column(unique = true, length = 64)
    private String email;
    @Column(length = 32)
    private String senha;
    @Column(length = 32)
    private String telefone;
    @Column(unique = true, length = 11)
    private String cpf;
    @OneToMany(cascade = CascadeType.PERSIST)
    private Endereco endereco;
    @OneToOne(optional = true)
    private Carrinho carrinho;
    @OneToOne(optional = true)
    private ListaDeDesejos listaDeDesejos;

    public long getIDCliente() {
        return idCliente;
    }

    public void setIDCliente(long IDCliente) {
        this.idCliente = IDCliente;
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
        return telefone;
    }

    public void setTelefone(String Telefone) {
        this.telefone = Telefone;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String CPF) {
        this.cpf = CPF;
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

    public ListaDeDesejos getListaDeDesejo() {
        return listaDeDesejos;
    }

    public void setListadedesejos(ListaDeDesejos listaDeDesejos) {
        this.listaDeDesejos = listaDeDesejos;
    }
}