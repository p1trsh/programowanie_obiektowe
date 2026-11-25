public class Report implements Printable, Exportable, Savable{
    @Override
    public void print(){
        System.out.println("report");
    }
    @Override
    public void export(){
        System.out.println("report exported");
    }
    @Override
    public void save(){
        System.out.println("report saved");
    }
}
