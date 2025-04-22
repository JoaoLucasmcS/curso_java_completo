package q3_alunoNota.Application;

import q3_alunoNota.Entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student joaozinho = new Student();

        joaozinho.name = sc.nextLine();
        joaozinho.nota1 = sc.nextDouble();
        joaozinho.nota2 = sc.nextDouble();
        joaozinho.nota3 = sc.nextDouble();

        System.out.println("FINAL GRADE: " + joaozinho.notaFinal());

        System.out.println(joaozinho.aprovadoOuNao());

        if(joaozinho.notaFinal() < 60){
            System.out.println("MISSING: " + joaozinho.pontosFaltantes() + " POINTS");
        }

        sc.close();
    }
}
