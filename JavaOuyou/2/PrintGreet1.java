public class PrintGreet1 extends Thread {
  private String msg;
  public PrintGreet1(String msg){
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
