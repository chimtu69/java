public class FormalParameters {
    public static int sum(int a, int b) {
        int sum = a+b;
        a = 5;
        b = 10;
        return sum;
    }

    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Sum : "+sum(a,b));
        System.out.println(a + " " + b);
    }
    
}
