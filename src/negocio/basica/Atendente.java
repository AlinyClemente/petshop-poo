package negocio.basica;
// Generated 22/09/2011 20:56:27 by Hibernate Tools 3.2.0.CR1



/**
 * Atendente generated by hbm2java
 */
public class Atendente  implements java.io.Serializable {


     private int funcionarioCodPessoa;
     private Funcionario funcionario;

    public Atendente() {
    }

    public Atendente(int funcionarioCodPessoa, Funcionario funcionario) {
       this.funcionarioCodPessoa = funcionarioCodPessoa;
       this.funcionario = funcionario;
    }
   
    public int getFuncionarioCodPessoa() {
        return this.funcionarioCodPessoa;
    }
    
    public void setFuncionarioCodPessoa(int funcionarioCodPessoa) {
        this.funcionarioCodPessoa = funcionarioCodPessoa;
    }
    public Funcionario getFuncionario() {
        return this.funcionario;
    }
    
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }




}


