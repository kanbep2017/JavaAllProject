import java.util.ArrayList;

public class NameList {
  public static void main(String[] args){
    ArrayList<String> names = new ArrayList<String>();
    names.add("����");
    names.add("�c��");
    names.add("����");
    names.add("���");
    String search = args[0];
    boolean result = false;

    for(int i = 0; i < names.size(); i++){
      if(search.equals(names.get(i))){
        result = true;
      }
    }
    if(result){
      System.out.println(search + "����͊܂܂�Ă��܂�");
    } else {
      System.out.println(search + "����͊܂܂�Ă��܂���");
    }
  }
}
