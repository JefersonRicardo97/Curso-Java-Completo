    package enumercao_composicao.entities;

    public class ItemPedido {
        private Integer quantidade;
        private Double preco;
        private ProdutoEx produtoEx;

        public ItemPedido(){

        }
        public ItemPedido(ProdutoEx produtoEx,Double preco, Integer quantidade) {
            this.produtoEx = produtoEx;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        public Integer getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(Integer quantidade) {
            this.quantidade = quantidade;
        }

        public Double getPreco() {
            return preco;
        }

        public void setPreco(Double preco) {
            this.preco = preco;
        }

        public ProdutoEx getProdutoEx() {
            return produtoEx;
        }

        public void setProdutoEx(ProdutoEx produtoEx) {
            this.produtoEx = produtoEx;
        }

        public double subTotal(){
            return quantidade* preco;
        }
    }
