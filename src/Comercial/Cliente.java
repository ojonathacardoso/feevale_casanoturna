
package Comercial;

import Administracao.Pessoa;
import Eventos.Data;
import Eventos.Evento;
import java.util.Calendar;

public class Cliente extends Pessoa {
    
    private String nome;
    private String cpf;
    private char sexo;
    private Data dataNascimento;
    private boolean vip;
    private Evento ingressoEvento;

    public Cliente(String nome, String cpf, Data dataNascimento, char sexo, boolean vip)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.vip = vip;
        this.sexo = sexo;
        this.ingressoEvento = null;
    }
    
    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getCpf()
    {
        return cpf;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public Data getDataNascimento()
    {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento)
    {
        this.dataNascimento = dataNascimento;
    }
    
    public void getDadosCadastrais()
    {
        System.out.println("O cliente " + this.getNome() + ", CPF nº " + this.getCpf() + ", possui " + this.getIdade() + " anos de idade ");
    }

    public char getSexo()
    {
        return sexo;
    }

    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }

    public boolean isVip()
    {
        return vip;
    }

    public void setVip(boolean vip)
    {
        this.vip = vip;
    }
    
    public void setIngressoEvento(Evento evento)
    {
        this.ingressoEvento = evento;
    }
    
    public Evento getIngressoEvento()
    {
        return this.ingressoEvento;
    }
    
    public int getIdade()
    {
        int idade;
        Calendar cal = Calendar.getInstance();   
        int anoAtual = cal.get(Calendar.YEAR);
        int mesAtual = cal.get(Calendar.MONTH);
        
        idade = anoAtual - this.dataNascimento.getAno();
        
        if (mesAtual < this.dataNascimento.getMes())
        {
            idade--;
        }
        
        return idade;
    }
     
}