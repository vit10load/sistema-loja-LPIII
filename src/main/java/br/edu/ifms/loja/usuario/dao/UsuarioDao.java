/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.usuario.dao;

import br.edu.ifms.loja.app.dao.GenericDAO;
import br.edu.ifms.loja.usuario.datamodel.Usuario;

/**
 *
 * @author vitcl
 */
public class UsuarioDao extends GenericDAO<Usuario> {
    
    public UsuarioDao() {
        super(Usuario.class);
    }
    
}
