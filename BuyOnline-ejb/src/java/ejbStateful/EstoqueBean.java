/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbStateful;

import entity.Estoque;
import entity.EstoqueProduto;
import entity.Filial;
import java.util.List;

public interface EstoqueBean {

    public Estoque buscar(long id);

    public Filial buscarFilial(Estoque estoque);

    public void adicionarEstoqueProduto(EstoqueProduto estoqueProduto);

    public void removerEstoqueProduto(EstoqueProduto estoqueProduto);

    public List<EstoqueProduto> getEstoqueProduto();
}
