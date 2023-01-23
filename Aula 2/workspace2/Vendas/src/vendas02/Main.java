package vendas02;

public class Main {

	public static void main(String[] args){
		Venda vendas[] = new Venda[10];
		
		vendas[0] = new Venda();
		vendas[0].produto = "Camiseta";
		vendas[0].preco = 19.9f;
		vendas[0].quantidade = 1;
		
		vendas[1] = new Venda();
		vendas[1].produto = "Bermuda";
		vendas[1].preco = 39.9f;
		vendas[1].quantidade = 2;
	
		vendas[2] = new Venda();
		vendas[2].produto = "Oculos";
		vendas[2].preco = 29.9f;
		vendas[2].quantidade = 3;
		
		vendas[3] = new Venda();
		vendas[3].produto = "Calça";
		vendas[3].preco = 65.3f;
		vendas[3].quantidade = 1;

		vendas[4] = new Venda();
		vendas[4].produto = "Moletom";
		vendas[4].preco = 79.8f;
		vendas[4].quantidade = 4;
		
		vendas[5] = new Venda();
		vendas[5].produto = "Anel";
		vendas[5].preco = 129.3f;
		vendas[5].quantidade = 2;
		
		vendas[6] = new Venda();
		vendas[6].produto = "Brinco";
		vendas[6].preco = 15.5f;
		vendas[6].quantidade = 4;
		
		vendas[7] = new Venda();
		vendas[7].produto = "Pulseira";
		vendas[7].preco = 9.9f;
		vendas[7].quantidade = 5;
		
		vendas[8] = new Venda();
		vendas[8].produto = "Meia";
		vendas[8].preco = 3.5f;
		vendas[8].quantidade = 10;
		
		vendas[9] = new Venda();
		vendas[9].produto = "Tênis";
		vendas[9].preco = 229.5f;
		vendas[9].quantidade = 2;
		
		float total = 0;
		for(int i = 0; i < 10; i++) {
			System.out.printf("[%s][%.2f][%d][%.2f]\n", vendas[i].produto, vendas[i].preco, vendas[i].quantidade, vendas[i].subtotal());
			total+= vendas[i].subtotal();
		}
		System.out.printf("Total: R$ %.2f\n", total);
	}
		
}
