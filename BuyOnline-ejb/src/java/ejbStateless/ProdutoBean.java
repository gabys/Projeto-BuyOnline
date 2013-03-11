/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbStateless;

import entity.Produto;
import java.util.List;

public interface ProdutoBean {

    public Produto buscar(long id);

    public List<Produto> buscar();

    public Produto editar(Produto produto);

    public Boolean criar(Produto produto);
}
