public class MsgBox{
  private int index = 0;
  private String[] msgBox = new String[3];
  public synchronized void pushMsg(String msg){ // メッセージを格納するメソッド
    while (index == msgBox.length) {
      try {
        wait(); // メッセージボックスが満杯なら待機
      } catch (InterruptedException e) {
      }
    }
    msgBox[index] = msg;
    System.out.println(msg + "を格納");
    index++;
    notify(); // メッセージを格納した後、待機中のスレッドに通知
  }
  public synchronized String popMsg(){ // メッセージを取り出すメソッド
    while (index == 0) {
      try {
        wait(); // メッセージボックスが空なら待機
      } catch (InterruptedException e) {
      }
    }
    index--;
    notify(); // メッセージを取り出した後、待機中のスレッドに通知
    return msgBox[index];
  }
}
