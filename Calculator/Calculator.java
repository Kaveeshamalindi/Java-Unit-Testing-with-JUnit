public class Calculator {

    public int add(int a, int b){
        return a+b;
    }

    public double divide (int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Cannot divide by Zero");
        }
        return (double) a/b;
    }
}