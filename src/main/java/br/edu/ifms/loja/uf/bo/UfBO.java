/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.uf.bo;

import br.edu.ifms.loja.uf.dao.UfDAO;
import br.edu.ifms.loja.uf.datamodel.Uf;
import java.util.List;
import maruyama.components.mvc.GenericCRUDModel;

/**
 *
 * @author gusta
 */
public class UfBO extends GenericCRUDModel<Uf>{

    private UfDAO dao;

    public UfBO() {
        dao = new UfDAO();
        preencherLista(dao.listarTodos());
    }
    
    @Override
    public void salvarEmBaseDeDados(Uf t) {
        dao.persistir(t);
    }

    @Override
    public void removerEmBaseDeDados(Uf t) {
        dao.remover(t);
    }

    @Override
    public List<Uf> carregarLista() {
        return dao.listarTodos();
    }

    @Override
    public List<Uf> buscar(String string, String string1) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return null;
    }  
}
