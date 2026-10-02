
/*
 * Created on 03/10/2005
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
public class Sms extends Mensagem{
	private String telefone;
	
	public Sms(String newEmail,String newConteudo,String newDataHora,String telefone){
		super(newEmail,newConteudo,newDataHora);
		
		this.telefone = telefone;
		
		
	}
	
	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
	
	public String getTxtMensagem(){
	
			return  "SMS;"+this.getTelefone()+";"+super.getConteudo()+";"+super.getDataHora();
		
	}
	public void verifica()throws Exception{
		if(!(this.conteudo.length()<=20)){
			throw new Exception("Conteúdo maior do que vinte caracteres!");
		}
	}
	

}
