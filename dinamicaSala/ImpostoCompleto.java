public class ImpostoCompleto extends ImpostoRenda{
    
    protected double gastoEducacao;
    protected double gastoSaude;

    public ImpostoCompleto(double gastoEducacao_, double gastoSaude_, double rendaBruta_, int ano_){
        super(rendaBruta, ano);
        this.gastoEducacao_ = gastoEducacao;
        this.gastoSaude = gastoSaude;
    }

    public ImpostoCompleto(double rendaBruta, int ano)
    {
            double gastos = rendaBruta/10;
            this.ImpostoCompleto(gastos, gastos, rendaBruta, ano);
    }



    public double calculo(){
            if(this.rendaBruta < 100000){
                return this.super.rendaBruta*0.27;
            }else if(this.super.getRendaBruta() < 50000){
                return this.super.getRendaBruta()*0.12;
            }else{
                return this.super.getRendaBruta()*0.23;
            }
        }

    public double getGastoEducacao() {
        return this.gastoEducacao;
    }


    public double getGastoSaude() {
        return this.gastoSaude;
    }
}