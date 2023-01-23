package padrao;


public class Ex2 {

	public static void main(String[] args) {
	
	}
	publ	ic static class INSS{
		private String nome;
		private double salario;
		
	public INSS (String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		}
	}
	public double inss() {
		if(salario < 1212.01f)
			return salario * 7.5f / 100f;
		else if(salario < 2427.36f)
			return salario * 9 / 100f;
		else if(salario < 3641.04f)
			return salario * 12 / 100f;
		else if (salario < 7087.23f)
			return salario * 14 / 100f;
		else
			return 7087.22 * 14 / 100f;
	}
	@Override
	public String toString() {
		return String.format("%s\t%.2f\t%.2f", nome,salario, inss());
	}
	public String toCSV() {
		return String.format("%s;%.2f;%.2f\r\n", nome,salario, inss());
	}
}