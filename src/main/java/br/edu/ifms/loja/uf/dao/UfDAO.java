/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.uf.dao;

import br.edu.ifms.loja.app.dao.GenericDAO;
import br.edu.ifms.loja.uf.datamodel.Uf;

/**
 *
 * @author gusta
 */
public class UfDAO extends GenericDAO<Uf> {

    public UfDAO() {
        super(Uf.class);
    }

}
