/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.cliente.view;

import javax.swing.JDialog;
import javax.swing.JPanel;
import maruyama.components.mvc.GenericCRUDView;

/**
 *
 * @author vitcl
 */
public class ClienteView extends GenericCRUDView {

    private JDialog dialog;
    
    public ClienteView(JPanel formulario) {
        super(formulario);
        
        dialog = new JDialog();
        dialog.setModal(true);
        dialog.add(this);
        dialog.setSize(2000, 1200);
        dialog.setTitle("Cliente");
    }

    @Override
    public String[] configurarCamposDeBusca() {
        
        return new String[0];
    }
    
    public void setVisible(boolean visible){
        
        dialog.setVisible(visible);
    }
    
}
