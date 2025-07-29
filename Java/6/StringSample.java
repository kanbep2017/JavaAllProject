public class StringSample {
  public static void main(String[] args) {
    String s1 = "Java";
    String s2 = new String("Java");
    String s3 = "Java";

    System.out.println("s1.equals(s2)�F" + s1.equals(s2));
    System.out.println("s1.equals(s3)�F" + s1.equals(s3));
    System.out.println("s1 == s2�F" + (s1 == s2));
    System.out.println("s1 == s3�F" + (s1 == s3));

    System.out.println("s1.length()�F" + s1.length());
    System.out.println("s1.substring(1)�F" + s1.substring(1));
    System.out.println("s1.substring(1,3)�F" + s1.substring(1, 3));
  }
}
