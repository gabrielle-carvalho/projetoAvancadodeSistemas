package listaRevisao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Compras {
    private Map cProduto = new HashMap();
    private Map cFornecedor = new HashMap();
    private List cEstoque = new ArrayList();

    public boolean adicionaProduto(Produto p){
        cProduto.put(p.getCodigo(), p);
        return true;
    }

    public boolean adicionaFornecedor(Fornecedor f){
        cFornecedor.put(f.getCodigo(), f);
        return true;
    }

    public void compra(String codigoProduto, String codigoFornecedor,int qtd){
        Produto p = (Produto) cProduto.get(codigoProduto);
        Fornecedor f = (Fornecedor) cFornecedor.get(codigoFornecedor);
        Estoque e = new Estoque(p, f, qtd);
        
        boolean encontrou = false;
        
        for (Object obj : cEstoque) {
            Estoque e = (Estoque) obj;
            if (e.equals(novoEstoque)) {
                e.setQuantidade(e.getQuantidade() + qtd);
                encontrou = true;
                break;
            }
        }
        
        if (!encontrou) {
            cEstoque.add(novoEstoque); 
        }

    }

    public double quantidadeDeProduto(String codigoProduto) {
        double total = 0;
        for (Object obj : cEstoque) {
            Estoque e = (Estoque) obj;
            if (e.getProduto().getCodigo().equals(codigoProduto)) {
                total += e.getQuantidade();
            }
        }
        return total;
    }

    public String totalPorProduto() {
        String relatorio = "Total Produto\n";
        
        for (Object obj : cProduto.values()) {
            Produto p = (Produto) obj;
            double qtdTotal = quantidadeDeProduto(p.getCodigo());
            
            if (qtdTotal > 0) {
                relatorio += "Produto:" + p.getDescricao() + "\n";
                relatorio += "Total:" + (p.getPreco() * qtdTotal) + "\n";
            }
        }
        return relatorio;
    }

    public String fornecedorProdutos() {
        String relatorio = "Lista de Fornecedores e seus produtos\n";
        
        for (Object objForn : cFornecedor.values()) {
            Fornecedor f = (Fornecedor) objForn;
            relatorio += "Fornecedor: " + f.getDescricao() + "\n";
            
            for (Object objEst : cEstoque) {
                Estoque e = (Estoque) objEst;
                if (e.getFornecedor().getCodigo().equals(f.getCodigo())) {
                    relatorio += "Produto: " + e.getProduto().getDescricao() + "\n";
                }
            }
        }
        return relatorio;
    }

}
