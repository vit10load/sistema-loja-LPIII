/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.cliente.bo;

import br.edu.ifms.loja.cidade.datamodel.Cidade;
import br.edu.ifms.loja.cliente.datamodel.Cliente;
import br.edu.ifms.loja.cliente.view.FormCliente;
import javax.swing.JPanel;
import maruyama.components.mvc.GenericCRUDController;
import maruyama.components.mvc.GenericCRUDModel;
import maruyama.components.mvc.GenericCRUDView;

/**
 *
 * @author vitcl
 */
public class ClienteController extends GenericCRUDController<Cliente> {

    public ClienteController(GenericCRUDModel model, GenericCRUDView view) {
        super(model, view);
        
        carregarComboBoxCidade(view, (ClienteBO) model);
        
    }
    
    public void carregarComboBoxCidade(GenericCRUDView view, ClienteBO model) {
        
        FormCliente form = (FormCliente) view.getFormulario();
        form.getCampoComboBoxCidade().removeAllItems();
        
        for(Cidade cidades : model.listarCidades()){
    
            form.getCampoComboBoxCidade().addItem(cidades);
        }
    }

    @Override
    public void dadosViewParaModel(Cliente t, JPanel pnl) {
        
        FormCliente form = (FormCliente) pnl;
        t.setNome(form.getCampoNome().getText());
        t.setCpf(form.getCampoCpf().getText());
        t.setEndereco(form.getCampoEndereco().getText());
        t.setNumero(form.getCampoNumero().getText());
        t.setDataNascimento(form.getCampoDataNascimento().getText());
        t.setEmail(form.getCampoEmail().getText());
        t.setTelefone(form.getCampoTelefone().getText());
        t.setCep(form.getCampoCep().getText());
        t.setCidade((Cidade) form.getCampoComboBoxCidade().getSelectedItem());
    }

    @Override
    public void dadosModelParaView(Cliente t, JPanel pnl) {
        
        FormCliente form = (FormCliente) pnl;
        form.getCampoNome().setText(t.getNome());
        form.getCampoCpf().setText(t.getCpf());
        form.getCampoEndereco().setText(t.getEndereco());
        form.getCampoNumero().setText(t.getNumero());
        form.getCampoDataNascimento().setText(t.getDataNascimento());
        form.getCampoEmail().setText(t.getEmail());
        form.getCampoTelefone().setText(t.getTelefone());
        form.getCampoCep().setText(t.getCep());
        form.getCampoComboBoxCidade().setSelectedItem(t.getCidade());
        
    }
    
}
