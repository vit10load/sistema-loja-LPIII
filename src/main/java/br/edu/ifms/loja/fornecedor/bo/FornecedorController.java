/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.fornecedor.bo;

import br.edu.ifms.loja.cidade.datamodel.Cidade;
import br.edu.ifms.loja.fornecedor.datamodel.Fornecedor;
import br.edu.ifms.loja.fornecedor.view.FornecedorForm;
import javax.swing.JPanel;
import maruyama.components.mvc.GenericCRUDController;
import maruyama.components.mvc.GenericCRUDModel;
import maruyama.components.mvc.GenericCRUDView;

/**
 *
 * @author vitcl
 */
public class FornecedorController extends GenericCRUDController<Fornecedor> {

    public FornecedorController(GenericCRUDModel model, GenericCRUDView view) {
        super(model, view);
       
        carregarComboBoxCidade(view,(FornecedorBO) model);
       
    }
    
     public void carregarComboBoxCidade(GenericCRUDView view, FornecedorBO model) {
        FornecedorForm form = (FornecedorForm) view.getFormulario();
        form.getComboCidade().removeAllItems();
        
        for(Cidade cidades : model.listarCidades()){
    
            form.getComboCidade().addItem(cidades);
        }
    }

    @Override
    public void dadosViewParaModel(Fornecedor t, JPanel pnl) {
        FornecedorForm fornecedorForm = (FornecedorForm) pnl;
        t.setNomeFantasia(fornecedorForm.getNome().getText());
        t.setRazaoSocial(fornecedorForm.getRazaoSocial().getText());
        t.setCnpj(fornecedorForm.getCnpj().getText());
        t.setTelefone(fornecedorForm.getTelefone().getText());
        t.setEmail(fornecedorForm.getEmail().getText());
        t.setCep(fornecedorForm.getCep().getText());
        t.setEndereco(fornecedorForm.getEndereco().getText());
        t.setNumero(fornecedorForm.getNumero().getText());
        t.setCidade((Cidade) fornecedorForm.getComboCidade().getSelectedItem());
        
    }

    @Override
    public void dadosModelParaView(Fornecedor t, JPanel pnl) {
        
        FornecedorForm fornecedorForm = (FornecedorForm) pnl;
        
        fornecedorForm.getNome().setText(t.getNomeFantasia());
        fornecedorForm.getRazaoSocial().setText(t.getRazaoSocial());
        fornecedorForm.getCnpj().setText(t.getCnpj());
        fornecedorForm.getTelefone().setText(t.getTelefone());
        fornecedorForm.getEmail().setText(t.getEmail());
        fornecedorForm.getCep().setText(t.getCep());
        fornecedorForm.getEndereco().setText(t.getEndereco());
        fornecedorForm.getNumero().setText(t.getNumero());
        fornecedorForm.getComboCidade().setSelectedItem(t.getCidade());
        
    }
    
}
