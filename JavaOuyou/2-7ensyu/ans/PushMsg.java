public class PushMsg extends Thread{
  private MsgBox msgBox;
  String[] msg = {"おはよう", "おやすみ", "ただいま", "おかえり", "ありがとう"};

  public PushMsg(MsgBox msgBox){
    this.msgBox = msgBox;
  }
  public void run(){
    for(int i = 0; i < 5; i++) {
      msgBox.pushMsg(msg[i]);
      try {
        Thread.sleep((int)(Math.random() * 1000));
      } catch(InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
