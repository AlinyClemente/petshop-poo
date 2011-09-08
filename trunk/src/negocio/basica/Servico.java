package negocio.basica;
// Generated 08/09/2011 20:33:14 by Hibernate Tools 3.2.0.CR1


import java.util.HashSet;
import java.util.Set;

/**
 * Servico generated by hbm2java
 */
public class Servico  implements java.io.Serializable {


     private int codServico;
     private String descricao;
     private String duracao;
     private double valor;
     private Set funcionarios = new HashSet(0);
     private Set produtos = new HashSet(0);
     private Set agendas = new HashSet(0);
     private Set animals = new HashSet(0);

    public Servico() {
    }

	
    public Servico(int codServico, String descricao, String duracao, double valor) {
        this.codServico = codServico;
        this.descricao = descricao;
        this.duracao = duracao;
        this.valor = valor;
    }
    public Servico(int codServico, String descricao, String duracao, double valor, Set funcionarios, Set produtos, Set agendas, Set animals) {
       this.codServico = codServico;
       this.descricao = descricao;
       this.duracao = duracao;
       this.valor = valor;
       this.funcionarios = funcionarios;
       this.produtos = produtos;
       this.agendas = agendas;
       this.animals = animals;
    }
   
    public int getCodServico() {
        return this.codServico;
    }
    
    public void setCodServico(int codServico) {
        this.codServico = codServico;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDuracao() {
        return this.duracao;
    }
    
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
    public double getValor() {
        return this.valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Set getFuncionarios() {
        return this.funcionarios;
    }
    
    public void setFuncionarios(Set funcionarios) {
        this.funcionarios = funcionarios;
    }
    public Set getProdutos() {
        return this.produtos;
    }
    
    public void setProdutos(Set produtos) {
        this.produtos = produtos;
    }
    public Set getAgendas() {
        return this.agendas;
    }
    
    public void setAgendas(Set agendas) {
        this.agendas = agendas;
    }
    public Set getAnimals() {
        return this.animals;
    }
    
    public void setAnimals(Set animals) {
        this.animals = animals;
    }




}


