
package Comercial;

import Administracao.Financeiro;

public class Compra {
    
    private Produto produto;
    private int quantidade;
    private Fornecedor forcededor;
    private double valorUnitario;
    
    private Financeiro financas;
    
    public Compra(Produto produto, Fornecedor fornecedor, int quantidade, double valorUnitario, Financeiro financas)
    {
        this.produto = produto;
        this.forcededor = fornecedor;  
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.financas = financas;
        
        this.produto.setQtdeEstoque(this.produto.getQtdeEstoque() + quantidade);
        this.financas.novaDespesa(this.quantidade * this.valorUnitario);
        
        System.out.println("Foram adquiridos " + this.quantidade + " unidades de " + this.produto.getNome() + " do fornecedor " + this.forcededor.getNome() + " pelo valor unitário de R$ " + this.valorUnitario);
    }

    public Produto getProduto()
    {
        return produto;
    }

    public void setProduto(Produto produto)
    {
        this.produto = produto;
    }

    public int getQuantidade()
    {
        return quantidade;
    }

    public void setQuantidade(int quantidade)
    {
        this.quantidade = quantidade;
    }

    public Fornecedor getForcededor()
    {
        return forcededor;
    }

    public void setForcededor(Fornecedor forcededor)
    {
        this.forcededor = forcededor;
    }

    public double getValorUnitario()
    {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario)
    {
        this.valorUnitario = valorUnitario;
    }

}
