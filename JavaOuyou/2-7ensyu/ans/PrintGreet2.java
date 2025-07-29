public class PrintGreet2 implements Runnable{
  private String msg;
  public PrintGreet2(String msg){
    this.msg = msg;
  }
  public void run(){
    for(int i = 0; i < 3; i++){
      System.out.println(msg);
      try {
        Thread.sleep(1000);
      } catch(InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
