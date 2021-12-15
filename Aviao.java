package POOCLIENTE;

public class Aviao {
	
		//classe avião e apresente os atributos e métodos referentes esta classe
			
			private String companhiaAerea;
			private String quantidadePassageiros;
			private String BagagemMão;
			private String despachada;
			
			//declaração do método construtor
			
			public Aviao(String companhiaÁrea,String quantidadePassageiros,String BagagemMão,String despachada) 
			{
			
			this.companhiaAerea = companhiaAerea;
			this.quantidadePassageiros = quantidadePassageiros;
			this.BagagemMão = BagagemMão;
			this.despachada = despachada;
			
			}
			
			//método das classes
			
			public void imprimirInfo() {
				System.out.println("\nQual a companhia responsável:"+companhiaAerea+",");
				System.out.println("\nQuantos passageiros irão viajar:"+quantidadePassageiros+",");
				System.out.println("\nQual o tipo de bagagem:"+BagagemMão+ " ou " +despachada);}
				
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

			public String getBagagemMão() {
				return BagagemMão;
			}

			public void setBagagemMão(String bagagemMão) {
				BagagemMão = bagagemMão;
			}

			public String getDespachada() {
				return despachada;
			}

			public void setDespachada(String despachada) {
				this.despachada = despachada;
			}
			}
			