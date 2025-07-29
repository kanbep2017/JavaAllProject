public class PopMsg extends Thread{
  private MsgBox msgBox;

  public PopMsg(MsgBox msgBox){
    this.msgBox = msgBox;
  }
  public void run(){
    for(int i = 0; i < 5; i++) {
      String msg = msgBox.popMsg();
      System.out.println(msg + "‚ðŽæ‚èo‚µ");
      try {
        Thread.sleep((int)(Math.random() * 1000));
      } catch(InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
