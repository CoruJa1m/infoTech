import java.sql.Date;

public class Equipamento {
         
       private String nomeEquip;
       private String modeloEquip;
       private Date dataChegada;
       private String nomeCliente;
       private String problematEquip;




       
       public Equipamento() {
      }



       public Equipamento(String nomeEquip, String modeloEquip, Date dataChegada, String nomeCliente,
            String problematEquip) {
         this.nomeEquip = nomeEquip;
         this.modeloEquip = modeloEquip;
         this.dataChegada = dataChegada;
         this.nomeCliente = nomeCliente;
         this.problematEquip = problematEquip;
      }


      
       public String getModeloEquip() {
          return modeloEquip;
       }
       public void setModeloEquip(String modeloEquip) {
          this.modeloEquip = modeloEquip;
       }
       public Date getDataChegada() {
          return dataChegada;
       }
       public void setDataChegada(Date dataChegada) {
          this.dataChegada = dataChegada;
       }
       public String getNomeCliente() {
          return nomeCliente;
       }
       public void setNomeCliente(String nomeCliente) {
          this.nomeCliente = nomeCliente;
       }
       public String getProblematEquip() {
          return problematEquip;
       }
       public void setProblematEquip(String problematEquip) {
          this.problematEquip = problematEquip;
       }



       public String getNomeEquip() {
          return nomeEquip;
       }



       public void setNomeEquip(String nomeEquip) {
          this.nomeEquip = nomeEquip;
       }


   
    }

