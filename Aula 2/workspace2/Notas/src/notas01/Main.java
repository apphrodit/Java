package notas01;

public class Main {

	public static void main(String[] args) {
		
		Boletim notas[] = new Boletim[5];
		
		notas[0] = new Boletim("Arnaldo", 8f, 10f,9f);
		
		notas[1] = new Boletim("Pedro", 6f, 9f, 8f);
		
		notas[2] = new Boletim("Júlio", 10f, 10f, 10f);
		
		notas[3] = new Boletim("Amanda", 5f, 5f, 5f);
		
		notas[4] = new Boletim("Laura", 9f, 10f, 3f);

		System.out.println("Aluno\tPortuguês\tMatemática\tCiências\tConceito");
		for(int i = 0; i < 5; i++) {
			System.out.println(notas[i].toString());
		}
	}

}
