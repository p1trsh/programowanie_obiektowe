public class Manager extends Employee{
    @Override
    public double calculateSalary(double workHours){
        return workHours * 70;
    }
}
