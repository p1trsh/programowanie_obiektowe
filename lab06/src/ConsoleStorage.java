public class ConsoleStorage implements Storage{
    public void save(String data){
        System.out.println("saving to console: " + data);
    }
}
