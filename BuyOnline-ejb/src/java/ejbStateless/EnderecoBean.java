/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbStateless;

import entity.Endereco;

public interface EnderecoBean {

    public Endereco buscar(long id);

    public Endereco editar(Endereco endereco);

    public Endereco criar(Endereco endereco);
}
