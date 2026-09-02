public class CD extends MemoriaS{
	public static final int ABERTO = 1;
	public static final int FECHADO = 0;
	
	private int estado;
	
	public CD(int newTotal,int newUnidade){
		super(newTotal,newUnidade);
		this.estado = ABERTO;
	}
	
	public double getPerda(){
		return(0.98);
	}
	
	public double getEspacoDisponivelRealKB(){
		return(this.getEspacoDisponivelKB()*this.getPerda());
	}
	
	public boolean GravaKB(int newTamanho){
		if(this.estado==ABERTO){
			if(super.GravaKB(newTamanho)){
				this.estado = FECHADO;
				return(true);
			}
		}
		
		return(false);
			
	}
	
	public String getEstado(){
		return((this.estado==ABERTO)?"ABERTO":"FECHADO");
	}
	
	public String toString(){
		return("CD - Estado: "+this.getEstado()+" - "+super.toString());
	}

}