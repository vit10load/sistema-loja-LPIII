/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.fornecedor.bo;

import br.edu.ifms.loja.cidade.dao.CidadeDAO;
import br.edu.ifms.loja.cidade.datamodel.Cidade;
import br.edu.ifms.loja.fornecedor.dao.FornecedorDao;
import br.edu.ifms.loja.fornecedor.datamodel.Fornecedor;
import java.util.ArrayList;
import java.util.List;
import maruyama.components.mvc.GenericCRUDModel;

/**
 *
 * @author vitcl
 */
public class FornecedorBO extends GenericCRUDModel<Fornecedor> {
    
    private CidadeDAO dao;
    private FornecedorDao fDAO;

    public FornecedorBO() {
        
        dao = new CidadeDAO();
        fDAO = new FornecedorDao();
        preencherLista(fDAO.listarTodos());
    }

    public List<Cidade> listarCidades() {
        
        return dao.listarTodos();
    }

    @Override
    public void salvarEmBaseDeDados(Fornecedor t) {
        
        fDAO.persistir(t);
    }

    @Override
    public void removerEmBaseDeDados(Fornecedor t) {
        
        fDAO.remover(t);
    }

    @Override
    public List<Fornecedor> carregarLista() {
        
        return fDAO.listarTodos();
    }

    @Override
    public List<Fornecedor> buscar(String string, String string1) {
        
        return new ArrayList<Fornecedor>();
    }

    
}
