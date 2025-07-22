package bomday2;

import java.util.Scanner;

public class TestarArrayAluno {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double[] turma = new double[20];
        System.out.println("nome dos alunos:");
    	String nome1 = tec.nextLine();
    	String nome2 = tec.nextLine();
    	String nome3 = tec.nextLine();
    	String nome4 = tec.nextLine();
    	String nome5 = tec.nextLine();

        System.out.println("nota dos alunos:");

        for (int i = 0; i < 5; i++) {
            System.out.print("nota do aluno " + (i + 1) + ": ");
            turma[i] = tec.nextDouble();
            
            System.out.print("nota do aluno " + (i + 1) + ": ");
            turma[i] = tec.nextDouble();
        }

        System.out.println("notas:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + turma[i]);
        }
        System.out.println("------------------");

        System.out.println("aluno 1 se chama "+ nome1);
        System.out.println("aluno 2 se chama "+ nome2);
        System.out.println("aluno 3 se chama "+ nome3);
        System.out.println("aluno 4 se chama "+ nome4);
        System.out.println("aluno 5 se chama "+ nome5);


        tec.close();
       
    }
}
