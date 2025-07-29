public class Greeting2{
  public static void main(String[] args){
    PrintGreet2 pg1 = new PrintGreet2("‚¨‚Í‚æ‚¤");
    PrintGreet2 pg2 = new PrintGreet2("‚¨‚â‚·‚Ý");
    PrintGreet2 pg3 = new PrintGreet2("‚ ‚è‚ª‚Æ‚¤");
    Thread th1 = new Thread(pg1);
    Thread th2 = new Thread(pg2);
    Thread th3 = new Thread(pg3);
    th1.start();
    th2.start();
    th3.start();
  }
}
