public class MsgBox{
  private int index = 0;
  private String[] msgBox = new String[3];
  public synchronized void pushMsg(String msg){
    while(index == msgBox.length){
      try{
        wait();
      } catch(InterruptedException e) {
      }
    }
    msgBox[index] = msg;
    System.out.println(msg + "‚ðŠi”[");
    index++;
    notify();
  }
  public synchronized String popMsg(){
    while(index == 0){
      try{
        wait();
      } catch(InterruptedException e) {
      }
    }
    index--;
    notify();
    return msgBox[index];
  }
}
