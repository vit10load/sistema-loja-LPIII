/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.usuario.view;

import javax.swing.JDialog;
import javax.swing.JPanel;
import maruyama.components.mvc.GenericCRUDView;

/**
 *
 * @author vitcl
 */
public class UsuarioView extends GenericCRUDView {
    
    private JDialog janela;

    public UsuarioView(JPanel formulario) {
        super(formulario);
        janela = new JDialog();
        janela.setModal(true);
        janela.add(this);
        janela.setSize(2000, 1200);
        janela.setTitle("Usuario");
    }
    
    

    @Override
    public String[] configurarCamposDeBusca() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new String[0];
    }

    public void setVisible(boolean b) {
        janela.setVisible(b);
    }
    
}
