# Eleicoes
## Algoritmo e Fluxograma 

## Algoritmo Eleições
Início
	
	VAR INT entrada, j = 1, Cont = 0, pt = 0, pdt = 0, pl = 0, psdb = 0, nulo = 0, branco = 0;

	Enquanto cont <= 49 FAÇA

	  j++
	  escreva (''Eleitor %d, Digite sua opção de voto'', j)
	  leia (entrada)
	      case (entrada) faça
		  1: Início
			  pt++
		     Fim
		  2: Início 			
			  pdt++
		     Fim
	        3: Início
			  pl++
		     Fim
		  4: Início
			  psdb++
		     Fim
		  5: Início
		  	  nulo++
		     Fim
		  6: Início
			  branco++
	           Fim 
		  exceção: 
		     Início
		   	  escreva (''Inválida'')
	           Fim
	      Fim case

	Fim Enquanto

	escreva (''Total de votos:'')
	escreva (''PT: %d'', pt)
	escreva (''PDT: %d'', pdt)
	escreva (''PL: %d'', pl)
	escreva (''PSDB: %d'', psdb)
	escreva (''NULO: %d'', nulo)
	escreva (''BRANCO: %d'', branco)

FIM 

## Fluxograma Eleições
![Eleicoes](https://user-images.githubusercontent.com/104536317/167634439-704cea6d-6a4b-4d56-bb8c-6ccc0ebd3878.png)
