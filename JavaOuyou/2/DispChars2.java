public class DispChars2 {
  public static void main(String[] args) {
    DispThread th1 = new DispThread('+');
    DispThread th2 = new DispThread('-');
    DispThread th3 = new DispThread('*');
    try {
      th1.start();
      th1.join();
      th2.start();
      // th2.join();
      Thread.sleep(2000);
      th2.interrupt();
      th3.start();
    } catch (InterruptedException e) {
      System.err.println("ó·äOÇ™î≠ê∂ÇµÇ‹ÇµÇΩ");
    }
  }
}
