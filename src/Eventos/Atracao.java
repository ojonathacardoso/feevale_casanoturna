
package Eventos;

import Administracao.Financeiro;

public class Atracao {
    
    private String nome;
    private String tipo;
    private double valorContrato;
    private Financeiro financas;

    public Atracao(String nome, String tipo, double valorContrato, Financeiro financas)
    {
        this.nome = nome;
        this.tipo = tipo;
        this.financas = financas;
        
        financas.novaDespesa(valorContrato);
    }
    
    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    
}