/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbStateless;

import entity.Carrinho;
import entity.ListaDeDesejos;
import entity.Cliente;
import entity.Endereco;
import entity.*;
import java.util.List;

public class ClienteBeanImpl implements ClienteBean {

    @Override
    public Cliente buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Cliente> buscar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Cliente editar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boolean criar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Carrinho buscarCarrinho(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ListaDeDesejos buscarListaDeDesejos(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Endereco buscarEndereco(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
