public class IntegerSample {
  public static void main(String[] args) {
    try {
      int i = Integer.parseInt(args[0]);
      String s = Integer.toBinaryString(i);
      System.out.println("‚Qi”‚É•ÏŠ·F" + s);
    } catch (NumberFormatException e) {
      System.out.print(Integer.MIN_VALUE);
      System.out.print("‚©‚ç");
      System.out.print(Integer.MAX_VALUE);
      System.out.println("‚Ü‚Å‚Ì”’l‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
    }
  }
}
