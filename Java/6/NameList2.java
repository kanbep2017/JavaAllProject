import java.util.ArrayList;
import java.util.Iterator;

public class NameList2 {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    names.add("÷ˆä");
    names.add("“cŒ´");
    names.add("’†ì");
    names.add("—é–Ø");
    String search = args[0];
    boolean result = false;

    Iterator<String> it = names.iterator();
    while (it.hasNext()) {
      if (search.equals(it.next())) {
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
