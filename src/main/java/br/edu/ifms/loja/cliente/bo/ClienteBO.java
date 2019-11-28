/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.cliente.bo;

import br.edu.ifms.loja.cidade.dao.CidadeDAO;
import br.edu.ifms.loja.cidade.datamodel.Cidade;
import br.edu.ifms.loja.cliente.dao.ClienteDao;
import br.edu.ifms.loja.cliente.datamodel.Cliente;
import java.util.ArrayList;
import java.util.List;
import maruyama.components.mvc.GenericCRUDModel;

/**
 *
 * @author vitcl
 */
public class ClienteBO extends GenericCRUDModel<Cliente> {

    private ClienteDao dao;
    private CidadeDAO cidadeDao;
    
    public ClienteBO() {
        
        dao = new ClienteDao();
        cidadeDao = new CidadeDAO();
        preencherLista(carregarLista());
    }
    
    public List<Cidade> listarCidades(){
        
        return cidadeDao.listarTodos();
    }

    @Override
    public void salvarEmBaseDeDados(Cliente t) {
        
        dao.persistir(t);
    }

    @Override
    public void removerEmBaseDeDados(Cliente t) {
        
        dao.remover(t);
        
    }

    @Override
    public List<Cliente> carregarLista() {
        
        return dao.listarTodos();
    }

    @Override
    public List<Cliente> buscar(String string, String string1) {
        
        return new ArrayList<Cliente>();
    }
    
}
