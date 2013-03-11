/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbStateful;

import entity.Carrinho;
import entity.Pedido;
import java.util.List;

public class PedidoBeanImpl implements PedidoBean {

    @Override
    public Pedido buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Pedido> buscar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boolean criar(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pedido editar(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Carrinho buscarCarrinho(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
