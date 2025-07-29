import java.util.ArrayList;

public class ArrayListSample {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("Java“ü–åuÀ");
    list.add("‚±‚±‚Ü‚Å");
    list.add("‚æ‚­Šæ’£‚è‚Ü‚µ‚½‚ËI");

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
