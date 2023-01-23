package padrao;

import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("pt", "BR"));
		Scanner scan = new Scanner(System.in);
		Venda venda[] = new Venda[10];
		float maxPreco = 0, minPreco = 1000000;
		int barato = -1, caro = -1, vendido = 0;
		float total = 0, media = 0;
		float maisVendido = 0;
	
		System.out.println("Produto\tQuantidade\tPreço");
		for(int i = 0; i < 10; i++) {
			venda[i] = new Venda(scan.next(), scan.nextInt(),scan.nextFloat());
		}
		System.out.println("Produto\tQuantidade\tPreço\tSubtotal(): ");
		for(int i = 0; i < 10; i++) {
			System.out.println(venda[i].toString());
			total += venda[i].subtotal();
			media += venda[i].preco;
			if(venda[i].preco > maxPreco) {
				maxPreco = venda[i].preco;
				caro = i;
			}
			if(venda[i].preco < minPreco) {
				minPreco = venda[i].preco;
				barato = i;
			}
			if(venda[i].quantidade > maisVendido) {
				maisVendido = venda[i].quantidade;
				
			}
		}
		System.out.println("Estatísticas");
		System.out.printf("Total: R$%.2f", total);
		System.out.printf("Média de preços: R$%.2f",media/10);
		System.out.printf("Mais caro: %s\n",venda[caro].toString());
		System.out.printf("Mais barato: %s\n",venda[barato].toString());
		System.out.printf("Mais vendido: %s\n",venda[vendido].toString());
	}
}
