programa
{
	
	funcao inicio()
	{
		inteiro val[5], x,valores,maiorPon=0
		
		
		
		para (valores = 0 ; valores<5 ; valores++)
	{
		
	escreva("\nColoque os valores: ",valores)
	leia(val[valores])
	
	se(val[valores] > maiorPon){
	}
			maiorPon = val[valores]
		}
		

	para (valores = 0; valores<5 ; valores++){
		
	
	escreva("\nmaior pontuação é: ",+ valores,":",val[valores])
		escreva("\nO maior valor encontrado nos números informados foi de ",maiorPon) 
		
	}
		
		}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 199; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */