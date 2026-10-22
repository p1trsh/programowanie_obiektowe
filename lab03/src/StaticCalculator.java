public class StaticCalculator {
    private static int numberOfOperations;

    static int Add(int a, int b){
        numberOfOperations++;
        return a+b;
    }
    static int Add(int a, int b, int c){
        numberOfOperations++;
        return a+b+c;
    }
    static double Add(double a, double b){
        numberOfOperations++;
        return a+b;
    }
    static int Subtract(int a, int b){
        numberOfOperations++;
        return a-b;
    }
    static int Multiply(int a, int b){
        numberOfOperations++;
        return a*b;
    }
//    static double Multiply(int a, int b){
//        numberOfOperations++;
//        return a*b;
//    }
//    static float Multiply(int a, int b){
//        numberOfOperations++;
//        return a*b;
//    }
    // nie mozna tworzyc metod rozniacych sie od istniejacej jedynie typem zwracanym,
    // poniewaz nie ma jak ich rozroznic wykonujac je

    public static int GetNumberOfOperations(){
        return numberOfOperations;
    }
}
