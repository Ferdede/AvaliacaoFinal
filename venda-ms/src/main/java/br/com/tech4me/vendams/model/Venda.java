package br.com.tech4me.vendams.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("venda")
public class Venda {
    @Id
    private String id;
    private String codigo;
    private Integer quantidade;
    private String dataVenda;
    private Float valorVenda;
    private String produtoVenda;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public String getDataVenda() {
        return dataVenda;
    }
    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }
    public Float getValorVenda() {
        return valorVenda;
    }
    public void setValorVenda(Float valorVenda) {
        this.valorVenda = valorVenda;
    }
    public String getProduto() {
        return produtoVenda;
    }
    public void setProduto(String produto) {
        this.produtoVenda = produto;
    }
}
