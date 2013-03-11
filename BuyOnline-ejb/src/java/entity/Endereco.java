/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.*;

public class Endereco {

    @Id
    @GeneratedValue(generator = "ENDRECO_SEQ")
    @SequenceGenerator(name = "ENDRECO_SEQ", allocationSize = 1)
    private long idEndereco;
    @Column(length = 32)
    private String logradouro;
    @Column(length = 32)
    private String complemento;
    @Column(length = 32)
    private int numero;
    @Column(length = 32)
    private String CEP;

    public long getIDEndereco() {
        return idEndereco;
    }

    public void setIDEndereco(long IDEndereco) {
        this.idEndereco = IDEndereco;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
}
