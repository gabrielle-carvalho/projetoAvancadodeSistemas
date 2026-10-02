public abstract class Mensagem {
    protected String email;
    protected String conteudo;
    protected String dataHora;

    public Mensagem(String email, String conteudo, String dataHora) {
        this.email = email;
        this.conteudo = conteudo;
        this.dataHora = dataHora;
    }
// Deve verificar se a mensagem é válida através da lógica das 
// subclasses Email e Sms. Se não for válida deve lançar uma 
//exceção.
    public final String envia(Destinatario destinatario) throws Exception {
        this.verifica();
        
        return "Mensagem para " + destinatario.getNomeCompleto() + "\n" + this.getTxtMensagem();
    }

    public abstract void verifica() throws Exception;
    public abstract String getTxtMensagem();

    public String getEmail() {
        return email;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getDataHora() {
        return dataHora;
    }

public static void main(String args[]){ 
    
 Destinatario[] d = new Destinatario[2]; 
  
  d[0]= new Destinatario(); 
  d[0].setNome("emjorge"); 
  d[0].setNomeCompleto("Eduardo M. F. jorge"); 
     
  d[1]= new Destinatario(); 
  d[1].setNome("camila"); 
  d[1].setNomeCompleto("Camila S. P. Jorge"); 
 
  Mensagem email = new Email("emjorge@gamil.com","Prova Tópicos II","03/10/2005","Aviso"); 
  Mensagem email1 = new Email("emjorge@gmail.com","Prova Tópicos II","03/10/2005","");   
  Mensagem sms = new Sms("camila@gmail.com","A Prova de Tópicos II será na sala 36","03/10/2005","9129-2234"); 
  Mensagem sms1 = new Sms("camila@gmail.com","Prova Tópicos II","03/10/2005","9129-2234"); 
   
  try{ 
   System.out.println(email.envia(d[0])); 
  }catch(Exception e){  
    System.out.println(e.getMessage()); } 
  try{ 
   System.out.println(email1.envia(d[1])); 
  }catch(Exception e){  
   System.out.println(e.getMessage()); } 
try{ 
System.out.println(sms.envia(d[0])); 
}catch(Exception e){  
System.out.println(e.getMessage());  
} 
try{ 
System.out.println(sms1.envia(d[1])); 
}catch(Exception e){  
System.out.println(e.getMessage());  
} 
}
}