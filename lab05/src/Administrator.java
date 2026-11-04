public class Administrator extends Employee{
    @Override
    public double calculateSalary(double workHours){
        return workHours * 60;
    }
}
