package padrao;

public class Venda {
	
	String produto;
	int quantidade;
	float preco;

	Venda(){}
	
	Venda(String pro, int q, float p){
		produto = pro;
		quantidade = q;
		preco = p; 
	}
	
	public float subtotal(){
	return	quantidade * preco;
	}
	public String toString(){
		return String.format("%s\t%d\t%.2f\t%.2f",produto, quantidade, preco, subtotal());
	}
}