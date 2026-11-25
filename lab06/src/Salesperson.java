public class Salesperson extends Employee{
    public Salesperson(String name, double baseSalary){
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary(){
        return baseSalary*80;
    }
}
