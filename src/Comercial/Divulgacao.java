
package Comercial;

import Administracao.Funcionario;
import Eventos.Evento;

public class Divulgacao {
    
    private Funcionario publicitarios[];
    private Evento evento;
    private String meioDivulgacao;
    
    public Divulgacao(Funcionario publicitarios[], Evento evento, String meioDivulgacao)
    {
        this.publicitarios = publicitarios;
        this.evento = evento;
        this.meioDivulgacao = meioDivulgacao;
    }

    public Funcionario[] getPublicitarios()
    {
        return publicitarios;
    }

    public void setPublicitarios(Funcionario[] publicitarios)
    {
        this.publicitarios = publicitarios;
    }

    public Evento getEvento()
    {
        return evento;
    }

    public void setEvento(Evento evento)
    {
        this.evento = evento;
    }

    public String getMeioDivulgacao()
    {
        return meioDivulgacao;
    }

    public void setMeioDivulgacao(String meioDivulgacao)
    {
        this.meioDivulgacao = meioDivulgacao;
    }   
    
}