public class HD extends MemoriaS{
	private String numeroSerie;
	
	public HD (String newNumeroSerie,int newTotal,int newUnidade){
		super(newTotal,newUnidade);
		this.numeroSerie = newNumeroSerie;
	}
	
	public double getPerda(){
		return(this.getConverteKB(this.total)/10240/100);
	}
	
	public double getEspacoDisponivelRealKB(){
		return(this.getEspacoDisponivelKB()*(1-this.getPerda()));

	}
	
	public String getNumeroSerie(){
		return(this.numeroSerie);
	}

	public String toString(){
		return("HD - Número de Serie: "+this.numeroSerie+" - "+super.toString());
	}
}
