package negocio.basica;
// Generated 08/09/2011 20:33:14 by Hibernate Tools 3.2.0.CR1



/**
 * Veterinario generated by hbm2java
 */
public class Veterinario  implements java.io.Serializable {


     private int funcionarioPessoaCodPessoa;
     private Funcionario funcionario;
     private String crv;

    public Veterinario() {
    }

    public Veterinario(int funcionarioPessoaCodPessoa, Funcionario funcionario, String crv) {
       this.funcionarioPessoaCodPessoa = funcionarioPessoaCodPessoa;
       this.funcionario = funcionario;
       this.crv = crv;
    }
   
    public int getFuncionarioPessoaCodPessoa() {
        return this.funcionarioPessoaCodPessoa;
    }
    
    public void setFuncionarioPessoaCodPessoa(int funcionarioPessoaCodPessoa) {
        this.funcionarioPessoaCodPessoa = funcionarioPessoaCodPessoa;
    }
    public Funcionario getFuncionario() {
        return this.funcionario;
    }
    
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public String getCrv() {
        return this.crv;
    }
    
    public void setCrv(String crv) {
        this.crv = crv;
    }




}


