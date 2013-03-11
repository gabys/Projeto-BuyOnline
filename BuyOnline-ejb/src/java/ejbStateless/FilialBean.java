/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbStateless;

import entity.Endereco;
import entity.Estoque;
import entity.Filial;
import java.util.List;

public interface FilialBean {

    public Filial buscar(long id);

    public List<Filial> buscar();

    public Filial criar(Filial filial);

    public Filial editar(Filial filial);

    public List<Estoque> buscarEstoque(Filial filial);

    public Endereco buscarEndereco(Filial filial);
}
