import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSample {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("���ꂩ���");
    list.add("Java�̕׋���");
    list.add("�y����ł����܂��傤�I");

    Iterator<String> it = list.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
