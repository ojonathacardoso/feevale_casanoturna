
package Administracao;

import Comercial.Cliente;
import Eventos.Evento;

public class Seguranca extends Funcionario {

    private double altura;
    private double peso;
    private Evento evento;
    private String cargo;
    private static double salario;
    
    public Seguranca(String nome, String cpf, int dia, int mes, int ano, double peso, double altura)
    {
        super(nome, cpf, dia, mes, ano);
        this.peso = peso;
        this.altura = altura;
        this.cargo = "Segurança";
    }

    public Evento getEvento()
    {
        return evento;
    }

    public void setEvento(Evento evento)
    {
        this.evento = evento;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    public double getPeso()
    {
        return peso;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }
    
    public void setCargo(String cargo)
    {
        System.out.println("Você não pode definir o cargo de um Segurança!");
    }
    
    public String getCargo()
    {
        return cargo;
    }

    public static double getSalario()
    {
        return salario;
    }

    public static void setSalario(double salario)
    {
        Seguranca.salario = salario;
    }
    
    public void getDadosCadastrais()
    {
        System.out.println("O funcionário " + this.getNome() + ", CPF nº " + this.getCpf() + ", altura de " + this.getAltura() + "m, peso de " + this.getPeso() + "kg, trabalha no setor/cargo " + this.getCargo() + " desde " + this.getDataAdmissao());
    }
    
    public boolean liberarCliente(Cliente cliente)
    {
        if(cliente.getIngressoEvento() == this.getEvento())
        {
            if(cliente.getIdade() < this.evento.getClassificacaoEtaria())
            {
                System.out.println("Acesso negado devido ao cliente " + cliente.getNome() + " ter idade inferior à classificação etária do evento!");
                return false;
            }
            else
            {
                cliente.setIngressoEvento(null);
                return true;                
            }
        }
        else
        {
            System.out.println("O cliente " + cliente.getNome() + " não possui ingresso pra este evento!");
            return false;
        }
    }
      
}