package POOCLIENTE;


public class POOCLIENTE {




//Crie uma classe cliente e apresente os atributos e métodos referentes
//esta classe, em seguida crie um objeto cliente, defina as instancias deste
//objeto e apresente as informações deste objeto no console.

////atributos da classe

private String primeironomeCliente;
private String idadeCliente;
private String estadocivilCliente;
private String anodeNascimento;

//declaração do método construtor

public POOCLIENTE (String primeironomeCliente,String idadeCliente,String estadocivilCliente,String anodeNascimento)
{
	this.primeironomeCliente = primeironomeCliente;
	this.idadeCliente = idadeCliente;
	this.estadocivilCliente = estadocivilCliente;
	this.anodeNascimento = anodeNascimento;
}


//demais métodos da classe

public void imprimirInfo() {
	System.out.println(" \nInforme seu primeiro nome:"+primeironomeCliente+" informe sua idade "+idadeCliente+"Estado civil atual"+estadocivilCliente+"Ano de nascimento"+anodeNascimento);

}

{
	this.primeironomeCliente = primeironomeCliente;
}

public String getPrimeironomeCliente() {
	return primeironomeCliente;
}

public void setPrimeironomeCliente(String primeironomeCliente) {
	this.primeironomeCliente = primeironomeCliente;
}

public String getIdadeCliente() {
	return idadeCliente;
}

public void setIdadeCliente(String idadeCliente) {
	this.idadeCliente = idadeCliente;
}

public String getEstadocivilCliente() {
	return estadocivilCliente;
}

public void setEstadocivilCliente(String estadocivilCliente) {
	this.estadocivilCliente = estadocivilCliente;
}

public String getAnodeNascimento() {
	return anodeNascimento;
}

public void setAnodeNascimento(String anodeNascimento) {
	this.anodeNascimento = anodeNascimento;
}
}
