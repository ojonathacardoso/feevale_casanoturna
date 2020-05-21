
package Comercial;

import Administracao.Financeiro;
import Eventos.Evento;

public class Patrocinador implements Empresa {

    private String nome;
    private String cnpj;
    private double valorPatrocinio;
    private Evento evento;
    private Financeiro financas;

    public Patrocinador(String nome, String cnpj, double valorPatrocinio, Evento evento, Financeiro financas)
    {
        this.nome = nome;
        this.cnpj = cnpj;
        this.valorPatrocinio = valorPatrocinio;
        this.evento = evento;
        this.financas = financas;
        
        this.financas.novaReceita(valorPatrocinio);       
    }
    
    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getCnpj()
    {
        return cnpj;
    }

    public void setCnpj(String cnpj)
    {
        this.cnpj = cnpj;
    }
    
    public double getValorPatrocinio()
    {
        return valorPatrocinio;
    }

    public void setValorPatrocinio(double valorPatrocinio)
    {
        this.valorPatrocinio = valorPatrocinio;
    }
    
    public Evento getEvento()
    {
        return evento;
    }

    public void setEvento(Evento evento)
    {
        this.evento = evento;
    }
    
}