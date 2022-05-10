package FACENS.Lista2;

import java.util.Scanner;

public class Eleicoes {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		// variaveis para os candidatos e para conferencia no switch
		int i, j = 1, entrada;
		int pt = 0, pdt = 0, pl = 0, psdb = 0, nulo = 0, branco = 0;

		for (i = 0; i <= 50; i++) {// enquanto i menor que 5, ira repetir as perguntas
			System.out.printf("Eleitor %d", j); //chamando a var j, pra mostrar qual o numero do eleitor
			System.out.print(" Selecione o partido em que deseja votar!\n1 - (13)PT;\n2 - (12)PDT;\n3 - (22)PL;\n4"
					+ " - (45)PSDB;\n5 - Voto nulo;\n6 - Voto em branco;\nOpção desejada: ");
			entrada = sc.nextInt();
			j++;// contator de eleitores
			switch (entrada) {// 
			case 1://se a entrada for 1, conte + 1 na var pt
				pt++;
				break;
			case 2://se a entrada for 1, conte + 1 na var pdt
				pdt++;
				break;
			case 3://se a entrada for 1, conte + 1 na var pl
				pl++;
				break;
			case 4://se a entrada for 1, conte + 1 na var psdb
				psdb++;
				break;
			case 5://se a entrada for 1, conte + 1 na var nulo
				nulo++;
				break;
			case 6://se a entrada for 6, conte + 1 na var branco
				branco++;
				break;
			default: // se nenhuma das opcoes acima form selecionadas, mostrar 
				System.out.println("Opção inválida!");
			}
			System.out.println();//quebra linha

		}//fim for
		//printando os votos acumulados
		System.out.printf("\nTotal de votos:\nPT: %d\nPDT: %d\nPL: %d\nPSDB: %d\n", pt, pdt, pl, psdb);
		System.out.printf("Total de votos nulos: %d\n", nulo);
		System.out.printf("Total de votos nulos: %d\n", branco);

		sc.close();
	}//fim main

}
