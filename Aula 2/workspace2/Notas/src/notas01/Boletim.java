package notas01;

public class Boletim {
	String aluno;
	float port;
	float mat;
	float cien;

	Boletim(){}
	
	Boletim(String alu, float portu, float mate, float cienc){
		aluno = alu;
		port = portu;
		mat = mate;
		cien = cienc;
		
	}
	String conceito() {
		if (port >= 5 && mat >= 5 && cien >= 5)
			return "Aprovado";
		else 
			return "Reprovado";
	}
	public String toString() {
		return String.format("%s\t%.1f\t%.1f\t%.1f\t%s", aluno, port, mat,cien,conceito());
	}
}