public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("abcde");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.replace(1, 3, "a");
        System.out.println(sb);
        ;
    }

}