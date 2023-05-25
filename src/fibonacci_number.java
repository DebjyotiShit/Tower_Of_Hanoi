
// Write a fibonacci Number problem by using recursion in java ?
public class fibonacci_number {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }
    public static int fibonacci(int number){
        if(number<2){
            return number;
        }
        return fibonacci(number-1)+fibonacci(number-2);
    }
}
