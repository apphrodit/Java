package padrao;

public class Main {

	public static void main(String[] args) {
		Gato gato1 = new Gato();
		Gato gato2 = new Gato();
		Gato gato3 = new Gato();
		Gato gato4 = new Gato();
		
		//Configurar Atributos
		
		gato1.nome = "Gatão";
		gato1.raca = "Vira Latas";
		gato1.peso = 3.5f;
		
		//Utilizar Métodos
		gato1.ronronar();
		gato1.miar();
	}

}
