
 /* Created on 03/10/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author emjorge
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Email extends Mensagem{
	private String assunto; 
	public Email(String newEmail,String newConteudo,String newDataHora,String newAssunto){
		super(newEmail,newConteudo,newDataHora);
		this.assunto = newAssunto;
		
	}
	public void verifica()throws Exception{
		if (this.getAssunto().isEmpty()){
			throw new Exception("Assunto não está preenchido!");
		}
	}
	
	public String getTxtMensagem(){
		
			return  "EMAIL;"+super.getDataHora()+";"+super.getEmail()+";"+this.getAssunto()+";"+super.getConteudo();
		
	}
	
	

	/**
	 * @return Returns the assunto.
	 */
	public String getAssunto() {
		return assunto;
	}
}
