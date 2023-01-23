package padrao;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;



public class salario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome do colaborador.");
		String nome = scan.next();
		System.out.println("Digite o salário do colaborador.");
		float salario = scan.nextFloat();
		float fgts = (salario * 8  / 100);
		String salarioFinal = String.format("%s;%.2f;%.2f", nome, salario, fgts);
	
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("./bd/Salario.csv", true));
			bw.write(salarioFinal);
			bw.close();
			System.out.println("Arquivo criado com sucesso");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
