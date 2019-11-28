/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.usuario.bo;

import br.edu.ifms.loja.cidade.dao.CidadeDAO;
import br.edu.ifms.loja.cidade.datamodel.Cidade;
import br.edu.ifms.loja.usuario.dao.UsuarioDao;
import br.edu.ifms.loja.usuario.datamodel.Usuario;
import java.util.List;
import maruyama.components.mvc.GenericCRUDModel;

/**
 *
 * @author vitcl
 */
public class UsuarioBO extends GenericCRUDModel<Usuario> {
    
    private UsuarioDao dao;
    private CidadeDAO cidadeDao;

    public UsuarioBO() {
        
        cidadeDao = new CidadeDAO();
        dao = new UsuarioDao();
        preencherLista(dao.listarTodos());
    }
    
    
    
    @Override
    public void salvarEmBaseDeDados(Usuario t) {
        
        dao.persistir(t);
    }

    @Override
    public void removerEmBaseDeDados(Usuario t) {
        
        dao.remover(t);
    }

    @Override
    public List<Usuario> carregarLista() {
        
        return dao.listarTodos();
    }

    @Override
    public List<Usuario> buscar(String string, String string1) {
        
        return null;
    }

    public List<Cidade> listarCidades() {
        
        return cidadeDao.listarTodos();
    }
    
    
}
