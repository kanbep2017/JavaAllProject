public class NameArray {
  public static void main(String[] args) {
    String[] names = { "����", "�c��", "����", "���"}; 
    String search = args[0];
    boolean result = false; // �������ʂ��i�[

    for (int i = 0; i < names.length; i++) {
      if (search.equals(names[i])) {
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
