package negocio.basica;
// Generated 22/09/2011 19:55:05 by Hibernate Tools 3.2.0.CR1



/**
 * AgendaId generated by hbm2java
 */
public class AgendaId  implements java.io.Serializable {


     private int codAgenda;
     private int funcionarioCodPessoa;

    public AgendaId() {
    }

    public AgendaId(int codAgenda, int funcionarioCodPessoa) {
       this.codAgenda = codAgenda;
       this.funcionarioCodPessoa = funcionarioCodPessoa;
    }
   
    public int getCodAgenda() {
        return this.codAgenda;
    }
    
    public void setCodAgenda(int codAgenda) {
        this.codAgenda = codAgenda;
    }
    public int getFuncionarioCodPessoa() {
        return this.funcionarioCodPessoa;
    }
    
    public void setFuncionarioCodPessoa(int funcionarioCodPessoa) {
        this.funcionarioCodPessoa = funcionarioCodPessoa;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AgendaId) ) return false;
		 AgendaId castOther = ( AgendaId ) other; 
         
		 return (this.getCodAgenda()==castOther.getCodAgenda())
 && (this.getFuncionarioCodPessoa()==castOther.getFuncionarioCodPessoa());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCodAgenda();
         result = 37 * result + this.getFuncionarioCodPessoa();
         return result;
   }   


}


