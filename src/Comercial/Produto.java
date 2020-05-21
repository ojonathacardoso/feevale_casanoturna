
package Comercial;

public class Produto {
    
    private String nome;
    private int idadeRestricao;
    private int qtdeEstoque;
    private double valorUnitario;

    public Produto(String nome, double valorUnitario, int idadeRestricao)
    {
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.idadeRestricao = idadeRestricao;
    }
    
    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getQtdeEstoque()
    {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque)
    {
        this.qtdeEstoque = qtdeEstoque;
    }

    public double getValorUnitario()
    {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario)
    {
        this.valorUnitario = valorUnitario;
    }
    
    public int getIdadeRestricao()
    {
        return idadeRestricao;
    }

    public void setIdadeRestricao(int idadeRestricao)
    {
        this.idadeRestricao = idadeRestricao;
    }
   
}