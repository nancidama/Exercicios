	
programa
{
	
	funcao inicio()
	{
		real n1[3][2],n2[3][2],m1[3][2],m2[3][2]
		inteiro el=0,di=0

		para(el=0;el<3;el++)
		{
			para(di=0;di<2;di++)
			{
				escreva("\nEntre com o N1: ")
				leia(n1[el][di])
				escreva("\nEntre com o N2: ")
				leia(n2[el][di])
				m1[el][di] = n1[el][di] + n2[el][di]
				m2[el][di] = n1[el][di] - n2[el][di]
				
			}
		}
		para(el=0;el<3;el++)
		{
			para (di=0;di<2;di++)
			{
				escreva("\nSoma: ",m1[el][di]) //somas dos elementos de mesma posição das matrizes N1 e N2;

				escreva("\nDiferença: ",m2[el][di])	//diferenças dos elementos de mesma posição das matrizes N1 e N2.
	
			}
		}
	}	
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 265; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */