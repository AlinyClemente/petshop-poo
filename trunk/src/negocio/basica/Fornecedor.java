package negocio.basica;
// Generated 08/09/2011 20:33:14 by Hibernate Tools 3.2.0.CR1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Fornecedor generated by hbm2java
 */
public class Fornecedor  implements java.io.Serializable {


     private int pessoaCodPessoa;
     private Pessoa pessoa;
     private String razaosocial;
     private String nomefantasia;
     private String cnpj;
     private String ie;
     private Date dataabertura;
     private Set produtos = new HashSet(0);

    public Fornecedor() {
    }

	
    public Fornecedor(int pessoaCodPessoa, Pessoa pessoa, String razaosocial, String cnpj, String ie, Date dataabertura) {
        this.pessoaCodPessoa = pessoaCodPessoa;
        this.pessoa = pessoa;
        this.razaosocial = razaosocial;
        this.cnpj = cnpj;
        this.ie = ie;
        this.dataabertura = dataabertura;
    }
    public Fornecedor(int pessoaCodPessoa, Pessoa pessoa, String razaosocial, String nomefantasia, String cnpj, String ie, Date dataabertura, Set produtos) {
       this.pessoaCodPessoa = pessoaCodPessoa;
       this.pessoa = pessoa;
       this.razaosocial = razaosocial;
       this.nomefantasia = nomefantasia;
       this.cnpj = cnpj;
       this.ie = ie;
       this.dataabertura = dataabertura;
       this.produtos = produtos;
    }
   
    public int getPessoaCodPessoa() {
        return this.pessoaCodPessoa;
    }
    
    public void setPessoaCodPessoa(int pessoaCodPessoa) {
        this.pessoaCodPessoa = pessoaCodPessoa;
    }
    public Pessoa getPessoa() {
        return this.pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public String getRazaosocial() {
        return this.razaosocial;
    }
    
    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }
    public String getNomefantasia() {
        return this.nomefantasia;
    }
    
    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }
    public String getCnpj() {
        return this.cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getIe() {
        return this.ie;
    }
    
    public void setIe(String ie) {
        this.ie = ie;
    }
    public Date getDataabertura() {
        return this.dataabertura;
    }
    
    public void setDataabertura(Date dataabertura) {
        this.dataabertura = dataabertura;
    }
    public Set getProdutos() {
        return this.produtos;
    }
    
    public void setProdutos(Set produtos) {
        this.produtos = produtos;
    }




}


