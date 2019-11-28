/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.cidade.bo;

import br.edu.ifms.loja.cidade.dao.CidadeDAO;
import br.edu.ifms.loja.cidade.datamodel.Cidade;
import br.edu.ifms.loja.uf.dao.UfDAO;
import br.edu.ifms.loja.uf.datamodel.Uf;
import java.util.ArrayList;
import java.util.List;
import maruyama.components.mvc.GenericCRUDModel;

/**
 *
 * @author gusta
 */
public class CidadeBO extends GenericCRUDModel<Cidade> {

    private CidadeDAO dao;
    private UfDAO ufDAO;

    public CidadeBO() {
        dao = new CidadeDAO();
        ufDAO = new UfDAO();
        preencherLista(dao.listarTodos());
    }

    public List<Uf> listarUfs() {
        return ufDAO.listarTodos();
    }

    @Override
    public void salvarEmBaseDeDados(Cidade t) {
        dao.persistir(t);
    }

    @Override
    public void removerEmBaseDeDados(Cidade t) {
        dao.remover(t);
    }

    @Override
    public List<Cidade> carregarLista() {
        return dao.listarTodos();
    }

    @Override
    public List<Cidade> buscar(String string, String string1) {
        return new ArrayList<Cidade>();
    }

}
