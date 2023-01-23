package visao;

import java.util.Scanner;
import java.util.ArrayList;

import modelo.venda;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static ArrayList<venda> vendas = new ArrayList<>();
	static int menu = 0;

	public static void main(String[] args) {
		while (menu != 5) {
			System.out.println("1.Cadastrar Venda");
			System.out.println("2.Consultar Vendas");
			System.out.println("3.Alterar Venda");
			System.out.println("4.Excluir Venda");
			System.out.println("5.Terminar Programa");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Produto\tQuantidade\tPreço");
				create();
				break;
			case 2:
				System.out.println("Produto\tQuantidade\tPreço\tSubTotal");
				read();
				break;
			case 3:
				System.out.println("Digite qual produto quer alterar");
				update(scan.nextInt());
				break;
			case 4:
				System.out.println("Digite qual item quer excluir:");
				delete(scan.nextInt());
				break;
			case 5:
				System.out.println("Obrigado.");
				break;
			default:
				System.out.println("Opção Invalida ");
				break;
			}
		}
	}
	
	public static void create(){
		venda V = new venda();
		V.setProduto(scan.next());
		V.setQuantidade(scan.nextInt());
		V.setPreco(scan.nextFloat());
		vendas.add(V);
	}
	
	public static void read() {
		float total = 0;
		for(venda V: vendas) {
			System.out.println(V.toString());
			total += V.subTotal();
		}
		System.out.printf("Total = %.2f\n", total);
	}
	
	public static void update(int indice) {
		if(indice >= 0 && indice < vendas.size()){
			vendas.get(indice).toString();
			venda V = new venda();
			V.setProduto(scan.next());
			V.setQuantidade(scan.nextInt());
			V.setPreco(scan.nextFloat());
			vendas.set(indice, V);
			System.out.println("Venda alterada.");
		}else
				System.out.println("Item Inválido.");
	}
	
	public static void delete(int indice) {
		if(indice >= 0 && indice < vendas.size())
		vendas.remove(indice);
		else
			System.out.println("Item Inválido.");
	}
}