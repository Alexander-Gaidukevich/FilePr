
public class Tester {
    public static void main(String[] args) {
        String name1 = "src/input.txt";
        try{
            int a = 0;
            int b = 10/a;
        }
        catch (ArithmeticException e){
            System.out.println("на ноль делить нельзя");
        }
    }
}
