/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbStateless;

import entity.Endereco;
import entity.Estoque;
import entity.Filial;
import java.util.List;

public class FilialBeanImpl implements FilialBean {

    @Override
    public Filial buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Filial> buscar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Filial criar(Filial filial) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Filial editar(Filial filial) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Estoque> buscarEstoque(Filial filial) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Endereco buscarEndereco(Filial filial) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
