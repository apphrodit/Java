package padrao;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner (System.in);
	static ArrayList<Operacao> operacoes = new ArrayList<>();
	
	public static void main(String[] args) {
		float investTotal = 0, faturaTotal = 0, lucro = 0, lucroPorcento = 0;
		
		System.out.println("Produto\tQtd. Comprada\t Qtd. Vendida\t Preço Compra\t Preço Venda\r \n");
		for(int i = 0; i < 10; i++) {
			operacoes.add(new Operacao(scan.next(),scan.nextInt(),scan.nextInt(),scan.nextFloat(),scan.nextFloat()));
		}
		for(Operacao o: operacoes) {
			System.out.println(o.toString());
			investTotal += o.investimento();
			faturaTotal += o.faturamento();
		}
		lucro = faturaTotal - investTotal;
		lucroPorcento = lucro / faturaTotal * 100;
		System.out.println("Estatísticas: ");
		System.out.printf("Investimento total R$ %.2f\n", investTotal);
		System.out.printf("Faturamento total R$ %.2f\n", faturaTotal);
		System.out.printf("Lucro Total R$ %.2f\n", );
	}

}
