
package Administracao;

public class Juridico extends Funcionario {
    
    private int numeroOAB;
    private static double salario;
    
    public Juridico(String nome, String cpf, int dia, int mes, int ano, int numeroOAB)
    {
        super(nome, cpf, dia, mes, ano);
        this.numeroOAB = numeroOAB;
    }

    public int getNumeroOAB()
    {
        return numeroOAB;
    }

    public void setNumeroOAB(int numeroOAB)
    {
        this.numeroOAB = numeroOAB;
    }
    
    public static double getSalario()
    {
        return salario;
    }

    public static void setSalario(double salario)
    {
        Juridico.salario = salario;
    }
    
    public void defenderEmpresa()
    {
        
    }

    public void getDadosCadastrais()
    {
        System.out.println("O funcionário " + this.getNome() + ", CPF nº " + this.getCpf() + ", OAB nº " + this.getNumeroOAB() + ", trabalha no setor/cargo " + this.getCargo() + " desde " + this.getDataAdmissao());
    }
    
}