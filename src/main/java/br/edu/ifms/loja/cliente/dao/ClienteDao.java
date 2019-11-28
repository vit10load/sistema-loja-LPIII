/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.cliente.dao;

import br.edu.ifms.loja.app.dao.GenericDAO;
import br.edu.ifms.loja.cliente.datamodel.Cliente;

/**
 *
 * @author vitcl
 */
public class ClienteDao extends GenericDAO<Cliente> {

    public ClienteDao() {
        super(Cliente.class);
    }
    
    
    
}
