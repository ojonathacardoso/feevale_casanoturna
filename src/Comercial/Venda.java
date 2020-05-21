
package Comercial;

import Administracao.Financeiro;
import Administracao.Funcionario;

public class Venda {
    
    private Produto produto;
    private int quantidade;
    private Funcionario vendedor;
    private Cliente cliente;    
    
    private Financeiro financas;
    
    private boolean efetivada;

    public Venda(Produto produto, Funcionario vendedor, int quantidade, Cliente cliente, Financeiro financas)
    {
        this.vendedor = vendedor;
        this.produto = produto;        
        this.cliente = cliente;
        this.financas = financas;
        
        if(quantidade > produto.getQtdeEstoque())
        {
            System.out.println("Quantidade insuficiente no estoque!");
        }
        else
        {
            if(cliente.getIdade() >= produto.getIdadeRestricao())
            {
                this.produto.setQtdeEstoque(produto.getQtdeEstoque() - quantidade);
                this.quantidade = quantidade;
                this.efetivada = true;
                this.financas.novaReceita(quantidade * this.produto.getValorUnitario());
                System.out.println("Venda de " + this.quantidade + " " + this.produto.getNome() + " para o cliente " + this.cliente.getNome() + " efetuada com sucesso!");
            }
            else
            {
                this.quantidade = 0;
                this.efetivada = false;
                System.out.println("Venda não efetuada por cliente ter idade inferior à restrição da bebida!");
            }
        }
    }
    
    public Produto getProduto()
    {
        return produto;
    }

    public void setProduto(Produto produto) 
    {
        this.produto = produto;
    }

    public Funcionario getVendedor()
    {
        return vendedor;
    }

    public void setVendedor(Funcionario vendedor)
    {
        this.vendedor = vendedor;
    }

    public int getQuantidade()
    {
        return quantidade;
    }

    public void setQuantidade(int quantidade)
    {
        this.quantidade = quantidade;
    }

    public Cliente getCliente()
    {
        return cliente;
    }

    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }

    public boolean isEfetivada()
    {
        return efetivada;
    }

    public void setEfetivada(boolean efetivada)
    {
        this.efetivada = efetivada;
    }
    
}