public class DispThread extends Thread {
  private char myChar;

  public DispThread(char myChar) {
    this.myChar = myChar;
  }

  public void run() {
    for (int i = 0; i < 5; i++) {
      try {
        Thread.sleep((int) (Math.random() * 2000));
      } catch (InterruptedException e) {
        System.err.print("<Š„ž”­¶>");
      }
      System.out.print(myChar);
    }
  }
}
