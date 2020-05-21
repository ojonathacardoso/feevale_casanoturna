
package Eventos;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public int getDia()
    {
        return this.dia;
    }

    public void setDia(int Dia)
    {
        this.dia = Dia;
    }

    public int getMes()
    {
        return this.mes;
    }

    public void setMes(int Mes)
    {
        this.mes = Mes;
    }

    public int getAno()
    {
        return this.ano;
    }

    public void setAno(int Ano)
    {
        this.ano = Ano;
    }

}