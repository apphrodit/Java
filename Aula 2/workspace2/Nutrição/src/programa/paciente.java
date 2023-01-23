package programa;

public class Paciente {
	
	String nome;
	float peso;
	float altura;
	
	Paciente(){}
	
	Paciente(String n, float p, float a){
		nome = n;
		peso = p;
		altura = a;
	}

	public float imc () {
		return peso / (altura * altura);
	}
	public String diagnostico(){
		if (imc() < 16){
			return "Subpeso Severo.";
		}else if (imc() < 20){
			return "Subpeso.";
		}else if(imc() < 25){
			return "Normal.";
		}else if(imc() < 30){
			return "Sobre Peso.";
		}else if(imc() < 40){
			return "Obeso.";
		}
		else {	
			return "Obeso Mórbido.";
		}
	}
	public String toString() {
		return String.format("%s\t%.1f\t%.2f\t%.2f\t%s",nome, peso, altura, imc(), diagnostico());
	}
}
