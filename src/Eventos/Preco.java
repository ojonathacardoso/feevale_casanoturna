
package Eventos;

public class Preco {
    
    private Evento evento;
    private Hora hora;
    private double precoFeminino;
    private double precoMasculino;

    public Preco(Evento evento, Hora hora, double precoFeminino, double precoMasculino)
    {
        this.evento = evento;
        this.hora = hora;
        this.precoFeminino = precoFeminino;
        this.precoMasculino = precoMasculino;
    }
    
    public Evento getEvento()
    {
        return evento;
    }

    public void setEvento(Evento evento)
    {
        this.evento = evento;
    }

    public Hora getHora()
    {
        return hora;
    }

    public void setHora(Hora hora)
    {
        this.hora = hora;
    }

    public double getPrecoFeminino()
    {
        return precoFeminino;
    }

    public void setPrecoFeminino(double precoFeminino)
    {
        this.precoFeminino = precoFeminino;
    }

    public double getPrecoMasculino()
    {
        return precoMasculino;
    }

    public void setPrecoMasculino(double precoMasculino)
    {
        this.precoMasculino = precoMasculino;
    }
       
}