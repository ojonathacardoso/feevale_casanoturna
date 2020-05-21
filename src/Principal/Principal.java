
package Principal;

import Administracao.Financeiro;
import Administracao.Funcionario;
import Administracao.Juridico;
import Administracao.Seguranca;
import Comercial.Cliente;
import Comercial.Compra;
import Comercial.Fornecedor;
import Comercial.Patrocinador;
import Comercial.Produto;
import Comercial.Venda;
import Eventos.Atracao;
import Eventos.Data;
import Eventos.Evento;
import Eventos.Preco;

public class Principal {
    
    public static void main(String[] args)
    {
        //
        // Dinheiro
        //
        Financeiro financas = new Financeiro();
        financas.novaReceita(10000);
        
        System.out.println("O saldo financeiro atual da casa noturna é de R$ " + financas.getSaldo());
        System.out.println("\r");
        
        //
        // Funcionários
        //
        Funcionario patricia = new Funcionario("Patrícia", "020.020.020/00", 26,5,1988);
        patricia.setDataAdmissao(1,6,2010);
        patricia.setCargo("Atendente");

        Funcionario ana = new Funcionario("Ana", "020.020.020/00", 22,5,1975);
        ana.setDataAdmissao(19,7,2010);
        ana.setCargo("Atendente");
        
        Juridico jose = new Juridico("José", "020.020.020/00", 8,9,1981, 10022);
        jose.setDataAdmissao(16,8,2010);
        jose.setCargo("Advogado");
        
        Juridico eduardo = new Juridico("Eduardo", "020.020.020/00", 4,3,1976, 10023);
        eduardo.setDataAdmissao(12,9,2010);
        eduardo.setCargo("Advogado");
        
        Juridico.setSalario(4500.00);
        
        Seguranca tiago = new Seguranca("Tiago", "020.020.020/00", 22,12,1990, 87, 1.83);
        tiago.setDataAdmissao(5,3,2011);
        tiago.setCargo("Segurança");
        
        Seguranca sergio = new Seguranca("Sérgio", "020.020.020/00", 22,10,1980, 76, 1.76);
        sergio.setDataAdmissao(3,11,2012);
        sergio.setCargo("Segurança");
        
        Seguranca.setSalario(1200.00);
        
        Funcionario adriana = new Funcionario("Adriana", "020.020.020/00", 1,9,1977);
        adriana.setDataAdmissao(5,3,2013);
        adriana.setCargo("Publicitária");
        
        Funcionario debora = new Funcionario("Débora", "020.020.020/00", 13,7,1984);
        debora.setDataAdmissao(7,6,2013);
        debora.setCargo("Jornalista");
        
        Seguranca.setSalario(1400.00);
        
        System.out.println("\r");
        System.out.println("A equipe jurídica ganha atualmente R$ " + Juridico.getSalario());
        System.out.println("Os seguranças ganham atualmente R$ " + Seguranca.getSalario());
        System.out.println("\r");
        
        //
        // Eventos, atrações e patrocinadores
        //
        Atracao titas = new Atracao("Titas", "Titas", 10000, financas);        
        
        Evento showTitas = new Evento(22,05,2014, 21,00, "Show com Titas", 14);
        showTitas.addAtracao(titas);
        showTitas.addPreco(new Preco(showTitas, showTitas.getHora(), 60.00, 70.00));
        
        Patrocinador feevale = new Patrocinador("Bourbon", "02.780.280/0000-01", 12000, showTitas, financas);
        showTitas.addPatrocinador(feevale);    
        
        System.out.println("O saldo financeiro atual da casa noturna é de R$ " + financas.getSaldo());
        System.out.println("\r");
        
        //
        // Produtos e fornecedores
        //
        
        Fornecedor pepsico = new Fornecedor("Pepsico", "02.780.289/0001-22");
        Produto kaiser = new Produto("Kaiser", 5.00, 18);
        Produto pepsi = new Produto("Pepsi", 3.00, 10);
        
        Compra pepsicoKaiser = new Compra(kaiser, pepsico, 300, 2, financas);
        Compra pepsicoPepsi = new Compra(pepsi, pepsico, 100, 2, financas);
        
        System.out.println("\r");
        System.out.println("A casa noturna possui atualmente " + kaiser.getQtdeEstoque() + " unidades de " + kaiser.getNome());
        System.out.println("A casa noturna possui atualmente " + pepsi.getQtdeEstoque() + " unidades de " + pepsi.getNome());
        System.out.println("\r");
        
        System.out.println("O saldo financeiro atual da casa noturna é de R$ " + financas.getSaldo());
        System.out.println("\r");
        
        //
        // Clientes
        //
        Cliente jonatha = new Cliente("Jonatha", "022.921.600/56", new Data(26,8,1991), 'M', true);
        Cliente gabriela = new Cliente("Gabriela", "020.920.600/50", new Data(12,10,1998), 'F', false);
        Cliente fabiane = new Cliente("Fabiane", "020.920.600/55", new Data(12,10,1996), 'F', false);
        Cliente aninha = new Cliente("Ana", "022.900.200/60", new Data(1,1,2002), 'F', false);

        //
        // Ingressos
        //
        showTitas.comprarIngresso(jonatha, 0, financas);
        showTitas.comprarIngresso(gabriela, 0, financas);
        showTitas.comprarIngresso(aninha, 0, financas);
        
        System.out.println("O saldo financeiro atual da casa noturna é de R$ " + financas.getSaldo());
        System.out.println("\r");
        
        //
        // Segurança do evento
        //
        sergio.setEvento(showTitas);
        
        if(sergio.liberarCliente(jonatha))
        {
            Venda pepsiJonatha = new Venda(pepsi, ana, 5, jonatha, financas);
        }
        
        if(sergio.liberarCliente(gabriela))
        {
            Venda pepsiGabriela = new Venda(kaiser, adriana, 5, gabriela, financas);
        }
        
        if(sergio.liberarCliente(fabiane))
        {
            Venda pepsiJonatha = new Venda(pepsi, ana, 5, fabiane, financas);
        }
        
        if(sergio.liberarCliente(aninha))
        {
            Venda pepsiJonatha = new Venda(pepsi, adriana, 5, aninha, financas);
        }

        System.out.println("\r");
        System.out.println("A casa noturna possui atualmente " + kaiser.getQtdeEstoque() + " unidades de " + kaiser.getNome());
        System.out.println("A casa noturna possui atualmente " + pepsi.getQtdeEstoque() + " unidades de " + pepsi.getNome());
        System.out.println("\r");
        
        System.out.println("O saldo financeiro atual da casa noturna é de R$ " + financas.getSaldo());
        System.out.println("\r");
        
        
    }

}
