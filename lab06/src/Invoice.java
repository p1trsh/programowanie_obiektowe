public class Invoice implements Printable{
    @Override
    public void print(){
        System.out.println("invoice");
    }
    @Override
    public void printHeader(){
        System.out.println("---INVOICE---");
    }
}
