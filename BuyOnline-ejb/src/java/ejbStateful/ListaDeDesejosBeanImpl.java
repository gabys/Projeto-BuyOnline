/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbStateful;

import entity.Cliente;
import entity.ListaDeDesejos;
import entity.Produto;
import java.util.ArrayList;
import java.util.List;

public class ListaDeDesejosBeanImpl implements ListaDeDesejosBean {

    public List<Produto> listaProduto = new ArrayList<Produto>();

    @Override
    public ListaDeDesejos buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Cliente buscarCliente(ListaDeDesejos listaDeDesejos) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void adicionarProduto(Produto produto) {
        listaProduto.add(produto);
    }

    @Override
    public void removerProduto(Produto produto) {
        listaProduto.remove(produto);
    }

    @Override
    public List<Produto> getProduto() {
        return listaProduto;
    }
}
