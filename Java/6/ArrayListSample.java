import java.util.ArrayList;

public class ArrayListSample {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("Java����u��");
    list.add("�����܂�");
    list.add("�悭�撣��܂����ˁI");

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
