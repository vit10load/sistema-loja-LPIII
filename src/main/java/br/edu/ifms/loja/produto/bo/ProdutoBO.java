/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.produto.bo;

import br.edu.ifms.loja.fornecedor.dao.FornecedorDao;
import br.edu.ifms.loja.fornecedor.datamodel.Fornecedor;
import br.edu.ifms.loja.produto.dao.ProdutoDao;
import br.edu.ifms.loja.produto.datamodel.Produto;
import java.util.ArrayList;
import java.util.List;
import maruyama.components.mvc.GenericCRUDModel;

/**
 *
 * @author vitcl
 */
public class ProdutoBO extends GenericCRUDModel<Produto> {
    
    private ProdutoDao dao;
    private FornecedorDao fDAO;

    public ProdutoBO() {
        dao = new ProdutoDao();
        fDAO = new FornecedorDao();
        preencherLista(dao.listarTodos());
    }

    @Override
    public void salvarEmBaseDeDados(Produto t) {
   
        dao.persistir(t);
    }

    @Override
    public void removerEmBaseDeDados(Produto t) {
        
        dao.remover(t);
    }

    @Override
    public List<Produto> carregarLista() {
        
       return dao.listarTodos();
       
    }
    
     public List<Fornecedor> listarFornecedores() {
        
        return fDAO.listarTodos();
    }

    @Override
    public List<Produto> buscar(String string, String string1) {
        
        return new ArrayList<Produto>();
    }
    
    
    
    
}
