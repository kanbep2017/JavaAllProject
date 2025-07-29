public class NameArray {
  public static void main(String[] args) {
    String[] names = { "÷ˆä", "“cŒ´", "’†ì", "—é–Ø"}; 
    String search = args[0];
    boolean result = false; // ŒŸõŒ‹‰Ê‚ğŠi”[

    for (int i = 0; i < names.length; i++) {
      if (search.equals(names[i])) {
        result = true;
      }
    }
    if (result) {
      System.out.println(search + "‚³‚ñ‚ÍŠÜ‚Ü‚ê‚Ä‚¢‚Ü‚·");
    } else {
      System.out.println(search + "‚³‚ñ‚ÍŠÜ‚Ü‚ê‚Ä‚¢‚Ü‚¹‚ñ");
    }
  }
}
