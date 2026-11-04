public class Developer extends Employee{
    @Override
    public double calculateSalary(double workHours){
        return workHours * 50;
    }
}
