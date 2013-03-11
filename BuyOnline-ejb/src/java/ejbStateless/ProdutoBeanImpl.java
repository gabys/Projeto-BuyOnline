/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbStateless;

import entity.Produto;
import java.util.List;

public class ProdutoBeanImpl implements ProdutoBean {

    @Override
    public Produto buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Produto> buscar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Produto editar(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boolean criar(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
