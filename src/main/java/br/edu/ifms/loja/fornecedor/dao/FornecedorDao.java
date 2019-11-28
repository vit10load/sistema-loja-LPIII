/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.fornecedor.dao;

import br.edu.ifms.loja.app.dao.GenericDAO;
import br.edu.ifms.loja.fornecedor.datamodel.Fornecedor;

/**
 *
 * @author vitcl
 */
public class FornecedorDao extends GenericDAO<Fornecedor> {
    
    public FornecedorDao(){
        super(Fornecedor.class);
    }
    
}
