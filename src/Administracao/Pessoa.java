
package Administracao;

import Eventos.Data;

public abstract class Pessoa {
    
    public abstract String getNome();
    public abstract void setNome(String nome);
    public abstract String getCpf();
    public abstract void setCpf(String cpf);
    public abstract Data getDataNascimento();
    public abstract void setDataNascimento(Data dataNascimento);  
    public abstract void getDadosCadastrais();
    
}
