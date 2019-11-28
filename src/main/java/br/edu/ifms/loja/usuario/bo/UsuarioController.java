/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.usuario.bo;

import br.edu.ifms.loja.cidade.datamodel.Cidade;
import br.edu.ifms.loja.usuario.datamodel.Usuario;
import br.edu.ifms.loja.usuario.view.FormUsuario;
import javax.swing.JPanel;
import maruyama.components.mvc.GenericCRUDController;
import maruyama.components.mvc.GenericCRUDModel;
import maruyama.components.mvc.GenericCRUDView;

/**
 *
 * @author vitcl
 */
public class UsuarioController extends GenericCRUDController<Usuario> {

    public UsuarioController(GenericCRUDModel model, GenericCRUDView view) {
        super(model, view);
        
        carregarComboBoxCidade(view,(UsuarioBO) model);
    }
    
     public void carregarComboBoxCidade(GenericCRUDView view, UsuarioBO model) {
        FormUsuario form = (FormUsuario) view.getFormulario();
        form.getCampoComboBoxUsuario().removeAllItems();
        
        for(Cidade cidades : model.listarCidades()){
      
            form.getCampoComboBoxUsuario().addItem(cidades);
        }
    }

    @Override
    public void dadosViewParaModel(Usuario t, JPanel pnl) {
        
        FormUsuario formUsuario = (FormUsuario) pnl;
        
        t.setEmail(formUsuario.getCampoEmail().getText());
        t.setSenha(formUsuario.getCampoSenha().getText());
        t.setPapel(formUsuario.getCampoPapel().getText());
        t.setNome(formUsuario.getCampoNome().getText());
        t.setEndereco(formUsuario.getCampoEndereco().getText());
        t.setNumero(formUsuario.getCampoNumero().getText());
        t.setCep(formUsuario.getCampoCep().getText());
        t.setCidade((Cidade) formUsuario.getCampoComboBoxUsuario().getSelectedItem());
    }

    @Override
    public void dadosModelParaView(Usuario t, JPanel pnl) {
        
        FormUsuario formUsuario = (FormUsuario) pnl;
        formUsuario.getCampoEmail().setText(t.getEmail());
        formUsuario.getCampoSenha().setText(t.getSenha());
        formUsuario.getCampoPapel().setText(t.getPapel());
        formUsuario.getCampoNome().setText(t.getNome());
        formUsuario.getCampoEndereco().setText(t.getEndereco());
        formUsuario.getCampoNumero().setText(t.getNumero());
        formUsuario.getCampoCep().setText(t.getCep());
        formUsuario.getCampoComboBoxUsuario().setSelectedItem(t.getCidade());
    }
    
}
