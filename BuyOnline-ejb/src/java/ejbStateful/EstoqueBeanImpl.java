/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbStateful;

import entity.Estoque;
import entity.EstoqueProduto;
import entity.Filial;
import java.util.ArrayList;
import java.util.List;

public class EstoqueBeanImpl implements EstoqueBean {

    public List<EstoqueProduto> listaEstoqueProduto = new ArrayList<EstoqueProduto>();

    @Override
    public Estoque buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Filial buscarFilial(Estoque estoque) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void adicionarEstoqueProduto(EstoqueProduto estoqueProduto) {
       listaEstoqueProduto.add(estoqueProduto);
    }

    @Override
    public void removerEstoqueProduto(EstoqueProduto estoqueProduto) {
       listaEstoqueProduto.remove(estoqueProduto);
    }

    @Override
    public List<EstoqueProduto> getEstoqueProduto() {
        return listaEstoqueProduto;
    }
}
