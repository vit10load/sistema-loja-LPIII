/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.produto.bo;

import br.edu.ifms.loja.cidade.datamodel.Cidade;
import br.edu.ifms.loja.fornecedor.datamodel.Fornecedor;
import br.edu.ifms.loja.produto.datamodel.Produto;
import br.edu.ifms.loja.produto.view.FormProduto;
import javax.swing.JPanel;
import maruyama.components.mvc.GenericCRUDController;
import maruyama.components.mvc.GenericCRUDModel;
import maruyama.components.mvc.GenericCRUDView;

/**
 *
 * @author vitcl
 */
public class ProdutoController extends GenericCRUDController<Produto> {

    public ProdutoController(GenericCRUDModel model, GenericCRUDView view) {
        super(model, view);
        
        carregarComboBoxFornecedor(view,(ProdutoBO) model);
    }
    
    public void carregarComboBoxFornecedor(GenericCRUDView view, ProdutoBO model) {
        FormProduto form = (FormProduto) view.getFormulario();
        form.getCampoComboBoxFornecedor().removeAllItems();
        
        for(Fornecedor fornecedores : model.listarFornecedores()){
    
            form.getCampoComboBoxFornecedor().addItem(fornecedores);
        }
    }

    @Override
    public void dadosViewParaModel(Produto t, JPanel pnl) {
        
        FormProduto form = (FormProduto) pnl;
        t.setDescricao(form.getCampoDescricao().getText());
        t.setMarca(form.getCampoMarca().getText());
        t.setModelo(form.getCampoModelo().getText());
        t.setQtde(Integer.parseInt(form.getCampoQuantidade().getText()));
        t.setValor(Double.parseDouble(form.getCampoValor().getText()));
        t.setFornecedor((Fornecedor) form.getCampoComboBoxFornecedor().getSelectedItem());
    }

    @Override
    public void dadosModelParaView(Produto t, JPanel pnl) {
       
        FormProduto form = (FormProduto) pnl;
        form.getCampoDescricao().setText(t.getDescricao());
        form.getCampoMarca().setText(t.getMarca());
        form.getCampoModelo().setText(t.getModelo());
        form.getCampoQuantidade().setText(String.valueOf(t.getQtde()));
        form.getCampoValor().setText(String.valueOf(t.getValor().doubleValue()));
        form.getCampoComboBoxFornecedor().setSelectedItem(t.getFornecedor());
    }
    
}
