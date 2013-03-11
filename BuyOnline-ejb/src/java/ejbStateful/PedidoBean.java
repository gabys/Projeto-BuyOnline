/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbStateful;

import entity.Carrinho;
import entity.Pedido;
import java.util.List;

public interface PedidoBean {

    public Pedido buscar(long id);
    
    public List<Pedido> buscar();
    
    public Boolean criar(Pedido pedido);
    
    public Pedido editar(Pedido pedido);
    
    public Carrinho buscarCarrinho(Pedido pedido);
}
