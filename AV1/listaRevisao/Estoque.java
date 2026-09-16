package listaRevisao;

public class Estoque {
    private Produto produto;
    private Fornecedor fornecedor;
    private int quantidade;

    public Estoque(Produto produto, Fornecedor fornecedor, int quantidade){
        this.produto=produto;
        this.fornecedor=fornecedor;
        this.quantidade=quantidade;
    }

    public Produto getProduto(){
        return produto;
    }
    public Fornecedor getFornecedor(){
        return fornecedor;
    }
    public int getQuantidade(){
        return quantidade;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Estoque estoque = (Estoque) obj;
        
        return this.produto.getCodigo().equals(estoque.getProduto().getCodigo()) && this.fornecedor.getCodigo().equals(estoque.getFornecedor().getCodigo());
    }
}
