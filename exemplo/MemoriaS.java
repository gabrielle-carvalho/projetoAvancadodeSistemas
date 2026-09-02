public abstract class MemoriaS {

	public static final int BYTE = 1;
	public static final int KB = 2;
	public static final int MB = 3;
	public static final int GB = 4;
	
	protected double total;
	protected double utilizadoKB;
	protected int unidade;
	
	public MemoriaS(int newTotal,int newUnidade){
		this.total = newTotal;
		this.unidade = newUnidade;
		this.utilizadoKB = 0;
	}
	public MemoriaS(int newTotal){
		this(newTotal,KB);
	}
	
	public abstract double getPerda();
	public abstract double getEspacoDisponivelRealKB();
	
	public double getConverteKB(double valor){
		switch(this.unidade){
		  case BYTE: valor /= 1024; break;
		  case MB: valor *= 1024; break;
		  case GB: valor*= 1024*1024; break;
		}
		return(valor);
	}
	public double getEspacoDisponivelKB(){
		double totalKB = this.getConverteKB(this.total);
		return(totalKB-this.utilizadoKB);
	}
	public boolean GravaKB(int newTamanho){
		if(this.getEspacoDisponivelKB()>=newTamanho){
			this.utilizadoKB += newTamanho;
			return(true);
		}
		return(false);
	}
	public String getUnidade(){
		String uni;
		switch(this.unidade){
		  case BYTE: uni = "BYTE"; break;
		  case KB: uni = "KB"; break;
		  case MB: uni = "MB"; break;
		  case GB: uni = "GB"; break;
		  default: uni = "Unidade Inválida"; break;
		}
		return(uni);
	}
	public double getPercentualDisponivel(){
		return(this.getEspacoDisponivelRealKB()/this.getConverteKB(this.total)*100);
	}
	public String toString(){
		return("Percentual Disponível: "+this.getPercentualDisponivel()+"% - Espaço Total:"+this.getConverteKB(this.total)+"KB - Espaço Real:"+this.getEspacoDisponivelRealKB()+"KB - Perda:"+this.getPerda()+"%");
		//Percentual Disponível ...% Espaço Total ...KB Espaço Disponível Real ...KB Perda ...%
	}
	
	public static void main(String args[]){
	
		MemoriaS hd = new HD("46327",10,MemoriaS.MB);
		MemoriaS cd = new CD(650,MemoriaS.MB);

		System.out.println(hd);
		System.out.println(cd);
		
		hd.GravaKB(1024);
		System.out.println(hd);
		cd.GravaKB(600);
		System.out.println(cd);
		
		((HD) hd).getNumeroSerie();
		((CD)cd).getEstado();
		
	}
}
