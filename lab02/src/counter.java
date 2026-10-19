public class counter {
    int value;

    public void increaseOther(counter other){
        other.value += 1;
    }

    public counter(){
        this.value = 0;
    }
    public counter(int value) {
        this.value = value;
    }
}
