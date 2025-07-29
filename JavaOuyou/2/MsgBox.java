public class MsgBox{
  private int index = 0;
  private String[] msgBox = new String[3];
  public void pushMsg(String msg){
    msgBox[index] = msg;
    System.out.println(msg + "‚ðŠi”[");
    index++;
  }
  public String popMsg(){
    index--;
    return msgBox[index];
  }
}
