package POOCLIENTE;

public class Aviao {
	
		//classe avi�o e apresente os atributos e m�todos referentes esta classe
			
			private String companhiaAerea;
			private String quantidadePassageiros;
			private String BagagemM�o;
			private String despachada;
			
			//declara��o do m�todo construtor
			
			public Aviao(String companhia�rea,String quantidadePassageiros,String BagagemM�o,String despachada) 
			{
			
			this.companhiaAerea = companhiaAerea;
			this.quantidadePassageiros = quantidadePassageiros;
			this.BagagemM�o = BagagemM�o;
			this.despachada = despachada;
			
			}
			
			//m�todo das classes
			
			public void imprimirInfo() {
				System.out.println("\nQual a companhia respons�vel:"+companhiaAerea+",");
				System.out.println("\nQuantos passageiros ir�o viajar:"+quantidadePassageiros+",");
				System.out.println("\nQual o tipo de bagagem:"+BagagemM�o+ " ou " +despachada);}
				
				public Aviao(String modelo)
				{
					this.companhiaAerea = companhiaAerea;
				}
			public String getCompanhiaAerea() {
				return companhiaAerea;
			}

			public void setCompanhiaAerea(String companhiaAerea) {
				this.companhiaAerea = companhiaAerea;
			}

			public String getQuantidadePassageiros() {
				return quantidadePassageiros;
			}

			public void setQuantidadePassageiros(String quantidadePassageiros) {
				this.quantidadePassageiros = quantidadePassageiros;
			}

			public String getBagagemM�o() {
				return BagagemM�o;
			}

			public void setBagagemM�o(String bagagemM�o) {
				BagagemM�o = bagagemM�o;
			}

			public String getDespachada() {
				return despachada;
			}

			public void setDespachada(String despachada) {
				this.despachada = despachada;
			}
			}
			