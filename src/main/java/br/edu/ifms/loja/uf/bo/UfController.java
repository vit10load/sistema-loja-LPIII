/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.uf.bo;

import br.edu.ifms.loja.uf.datamodel.Uf;
import br.edu.ifms.loja.uf.view.FormUf;
import java.math.BigDecimal;
import javax.swing.JPanel;
import maruyama.components.mvc.GenericCRUDController;
import maruyama.components.mvc.GenericCRUDModel;
import maruyama.components.mvc.GenericCRUDView;

/**
 *
 * @author gusta
 */
public class UfController extends GenericCRUDController<Uf>{
    public UfController(GenericCRUDModel model, GenericCRUDView view) {
        super(model, view);
    }

    @Override
    public void dadosViewParaModel(Uf t, JPanel pnl) {
       FormUf form = (FormUf) pnl;
       t.setNome(form.getCampoNome().getText());
       t.setSigla(form.getCampoSigla().getText());
       t.setIcms(new BigDecimal(form.getCampoIcms().getText()));
    }

    @Override
    public void dadosModelParaView(Uf t, JPanel pnl) {
       FormUf form = (FormUf) pnl;
       form.getCampoNome().setText(t.getNome());
       form.getCampoSigla().setText(t.getSigla());
       form.getCampoIcms().setText(t.getIcms().toString());
    }
    
}
