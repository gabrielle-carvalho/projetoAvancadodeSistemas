public abstract class ImpostoRenda {
    protected double valorPagar;
    protected double rendaBruta;
    protected int ano;

public ImpostoRenda(double rendaBruta_, int ano_){
	this.rendaBruta = rendaBruta_;
	this.ano = ano_;
}

public double getRendaBruta(){ return this.rendaBruta;}
public int getAno(){ return this.ano;}
public double getValorPagar(){ return this.valo

public abstract double calculo();

public boolean processamento(int anoBase){
	if (this.getRendaBruta() > 12000){
		this.valorPagar = this.calculo();
           return true;
       } else{
         return false;
       }
}
