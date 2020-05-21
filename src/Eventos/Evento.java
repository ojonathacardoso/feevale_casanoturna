
package Eventos;

import Administracao.Financeiro;
import Comercial.Cliente;
import Comercial.Patrocinador;
import java.util.ArrayList;

public class Evento {
    
    private Data data;
    private Hora hora;
    private ArrayList<Atracao> atracoes = new ArrayList<Atracao>();
    private ArrayList<Patrocinador> patrocinadores = new ArrayList<Patrocinador>();
    private ArrayList<Preco> precos = new ArrayList<Preco>();
    private String nome;
    private int classificacaoEtaria;

    public Evento(int dia, int mes, int ano, int hora, int min, String nome, int classificacaoEtaria)
    {
        this.data = new Data(dia, mes, ano);
        this.hora = new Hora(hora, min);
        this.nome = nome;
        this.classificacaoEtaria = classificacaoEtaria;
    }
    
    public Data getData()
    {
        return data;
    }

    public void setData(Data data)
    {
        this.data = data;
    }

    public Hora getHora()
    {
        return hora;
    }

    public void setHora(Hora hora)
    {
        this.hora = hora;
    }

    public Atracao getAtracao(int index)
    {
        return atracoes.get(index);
    }

    public void addAtracao(Atracao atracao)
    {
        this.atracoes.add(atracao);
    }

    public Patrocinador getPatrocinador(int index)
    {
        return patrocinadores.get(index);
    }

    public void addPatrocinador(Patrocinador patrocinador)
    {
        this.patrocinadores.add(patrocinador);
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Preco getPreco(int index)
    {
        return precos.get(index);
    }

    public void addPreco(Preco preco)
    {
        this.precos.add(preco);
    }

    public int getClassificacaoEtaria()
    {
        return classificacaoEtaria;
    }

    public void setClassificacaoEtaria(int classificacaoEtaria)
    {
        this.classificacaoEtaria = classificacaoEtaria;
    }
    
    public void comprarIngresso(Cliente cliente, int tabelaPrecos, Financeiro financas)
    {
        if(cliente.getSexo() == 'M')
        {
            financas.novaReceita(this.precos.get(tabelaPrecos).getPrecoMasculino());
        }
        else
        {
            financas.novaReceita(this.precos.get(tabelaPrecos).getPrecoFeminino());
        }
        
        cliente.setIngressoEvento(this);
    }
    
}