
package Administracao;

public class Financeiro {
    
    private double receitas;
    private double despesas;
    
    public Financeiro()
    {
        //
    }
    
    public void novaReceita(double r)
    {
        this.receitas += r;
    }
    
    public void novaDespesa(double r)
    {
        this.despesas += r;
    }

    public double getReceitas()
    {
        return receitas;
    }

    public double getDespesas()
    {
        return despesas;
    }
    
    public double getSaldo()
    {
        return(this.receitas-this.despesas);
    }

}