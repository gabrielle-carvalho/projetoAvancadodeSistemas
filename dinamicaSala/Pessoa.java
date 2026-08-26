public class Pessoa {
	public static final int COMPLETO=0; 
	public static final int SIMPLIFICADO=1;
	private String nome;private String cpf;

	public Pessoa(String nome_,String cpf_){
		this.nome = nome_;
		this.cpf = cpf_;
	}

	public String relatorioImpostoRenda(ImpostoRenda i, int tipo){
 		String temp = null;

 		temp = "Dados Pessoais \n";
 		temp = temp+"Nome:"+this.nome+"\n";
 		temp = temp+"Cpf:"+this.cpf+"\n";
		temp = temp+"Dados do Calculo \n";
 
 		if (tipo == Pessoa.COMPLETO){
			temp = temp+"Imposto Completo \n";
 			temp = temp+"Gastos Com Saúde:" + this.getGastoSaude() + "\n";
 			temp = temp+"Gastos Com Educação:" + this.getGastoEducacao() + "\n";
 		}else{
			temp = temp+" Imposto Simplificado \n";
 		}
 		temp = temp+"Renda Bruta: "+ this.getRendaBruta() + "\n";
 		temp = temp+"Valor a Pagar:" +this.getValorPagar() + "\n";
 		return temp;
	}

	public static void main(String args[]){
        Pessoa p = new Pessoa("Eduardo Jorge","88777008-45");
        ImpostoRenda i = new ImpostoCompleto(100000,2005,2600,10000);
        i.processamento(2005);
        System.out.println(p.relatorioImostoRenda(i,Pessoa.COMPLETO));
        Pessoa p1 = new Pessoa("Camila Silva","900007008-21");
        ImpostoRenda i1 = new ImpostoSimplificado(50000,2005);
        i1.processamento(2005);
        System.out.println(p1.relatorioImostoRenda(i1,Pessoa.SIMPLIFICADO));
	}
}