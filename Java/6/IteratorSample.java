import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSample {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("‚±‚ê‚©‚ç‚à");
    list.add("Java‚Ì•×‹­‚ğ");
    list.add("Šy‚µ‚ñ‚Å‚¢‚«‚Ü‚µ‚å‚¤I");

    Iterator<String> it = list.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
