import java.util.ArrayList;
import java.util.Iterator;

public class NameList2 {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    names.add("����");
    names.add("�c��");
    names.add("����");
    names.add("���");
    String search = args[0];
    boolean result = false;

    Iterator<String> it = names.iterator();
    while (it.hasNext()) {
      if (search.equals(it.next())) {
        result = true;
      }
    }
    if (result) {
      System.out.println(search + "����͊܂܂�Ă��܂�");
    } else {
      System.out.println(search + "����͊܂܂�Ă��܂���");
    }
  }
}
