
package Administracao;

import Eventos.Data;

public class Funcionario extends Pessoa {
    
    private String nome;
    private String cpf;
    private Data dataNascimento;
    private Data dataAdmissao;
    private String cargo;
    
    public Funcionario(String nome, String cpf, int dia, int mes, int ano)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = new Data(dia, mes, ano);
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

    public Data getDataAdmissao()
    {
        return dataAdmissao;
    }

    public void setDataAdmissao(int dia, int mes, int ano)
    {
        this.dataAdmissao = new Data(dia, mes, ano);
    }

    public String getCargo()
    {
        return cargo;
    }

    public void setCargo(String cargo)
    {
        this.cargo = cargo;
    }

    public void getDadosCadastrais()
    {
        System.out.println("O funcionário " + this.getNome() + ", CPF nº " + this.getCpf() + ", trabalha no setor/cargo " + this.getCargo() + " desde " + this.getDataAdmissao());
    }
    
}