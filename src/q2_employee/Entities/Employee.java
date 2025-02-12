package q2_employee.Entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double CalcularSalarioLiquido(){
        return grossSalary - tax;
    }

    public void IncrementoNoSalario(double inc){

        grossSalary += (grossSalary * (inc/100));

    }
    public String toString(){

        return  name + ", $ " + String.format("%.2f", CalcularSalarioLiquido());


    }

}