package bomday2;
import java.util.Scanner;
public class main {


	public static void main(String[] args) {


		Scanner tec = new Scanner (System.in);


		System.out.println("Diga o nome do aluno");
        String nome = tec.nextLine();
		double temp [] = new double[20];


	System.out.println("Diga as notas do aluno");

	double valor1 = tec.nextDouble();
	double valor2 = tec.nextDouble();
	   temp[1]= valor1;
	   temp[2]= valor2;
	   temp[3]= valor1 + valor2 / 2;

	System.out.println(temp[1]);
	System.out.println(temp[2]);
	
//	----------------2------------------
	System.out.println("A media das notas é:");
	System.out.println(temp[3]);

	// ----------------3--------------

	
}
}
