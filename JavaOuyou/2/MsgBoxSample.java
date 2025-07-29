public class MsgBoxSample{
  public static void main(String[] args){
    MsgBox msgBox = new MsgBox();
    
    PushMsg push = new PushMsg(msgBox);
    push.start();
    
    PopMsg pop = new PopMsg(msgBox);
    pop.start();
  }
}
