package q3_alunoNota.Entities;

public class Student {

    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal(){
        return nota1 + nota2 + nota3;
    }

    public String aprovadoOuNao(){

        if(notaFinal() >= 60){
            return  "PASS";
        } else{
            return "FAILED";
        }
    }

    public double pontosFaltantes() {

        return 60 - notaFinal();

    }
}

