/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import entity.enumerador.situacaoEntrega;
import entity.enumerador.situacaoPagamento;
import javax.persistence.*;

public class Pedido {

    @Id
    @GeneratedValue(generator = "PEDIDO_SEQ")
    @SequenceGenerator(name = "PEDIDO_SEQ", allocationSize = 1)
    private long idPedido;
    @OneToOne(mappedBy = "", fetch = FetchType.EAGER)
    private Carrinho carrinho;
    @Column(length = 32)
    private situacaoPagamento statusPagamento;
    @Column(length = 32)
    private situacaoEntrega statusEntrega;

    public long getIDPedido() {
        return idPedido;
    }

    public void setIDPedido(long IDPedido) {
        this.idPedido = IDPedido;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public situacaoPagamento isStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(situacaoPagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public situacaoEntrega isStatusEntrega() {
        return statusEntrega;
    }

    public void setStatusEntrega(situacaoEntrega statusEntrega) {
        this.statusEntrega = statusEntrega;
    }
}
