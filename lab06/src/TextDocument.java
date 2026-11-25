public class TextDocument implements ReadWrite{
    @Override
    public void read(){
        System.out.println("read");
    }

    @Override
    public void write(){
        System.out.println("write");
    }
}
