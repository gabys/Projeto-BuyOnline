/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbStateless;

import entity.Carrinho;
import entity.Cliente;
import entity.Endereco;
import entity.ListaDeDesejos;
import java.util.List;

/**
 *
 * @author GFactory
 */
public interface ClienteBean {

    public Cliente buscar(long id);

    public List<Cliente> buscar();

    public Cliente editar(Cliente cliente);

    public Boolean criar(Cliente cliente);

    public Carrinho buscarCarrinho(Cliente cliente);

    public ListaDeDesejos buscarListaDeDesejos(Cliente cliente);

    public Endereco buscarEndereco(Cliente cliente);
}
