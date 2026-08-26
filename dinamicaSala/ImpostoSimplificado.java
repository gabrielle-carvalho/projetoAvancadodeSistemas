public class ImpostoSimplificado extends ImpostoRenda {
 public ImpostoSimplificado(double rendaBruta_,int ano_, double valorPagar){
  super(valorPagar, ano_, valorPagar);
  this.rendaBruta = rendaBruta_
  this.ano=ano_;
 }
public double calculo(){
 return rendaBruta*0.15;
 }
}