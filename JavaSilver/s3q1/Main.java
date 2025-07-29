public class Main {
    public static void main(String[] args) {
        int a = 3;
        System.out.println("a:" + a);
        System.out.println("---------------");
        int b = a += 5;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("---------------");
        System.out.println(a + b);
    }
}
