/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.produto.dao;

import br.edu.ifms.loja.app.dao.GenericDAO;
import br.edu.ifms.loja.produto.datamodel.Produto;

/**
 *
 * @author vitcl
 */
public class ProdutoDao extends GenericDAO<Produto> {
    
    public ProdutoDao() {
        super(Produto.class);
    }
    
}
