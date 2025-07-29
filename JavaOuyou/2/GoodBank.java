public class GoodBank {
  private int balance;

  public GoodBank() {
    this.balance = 0;
  }

  public synchronized void useATM(int money) {
    while (balance + money < 0) {
      try {
        wait();
      } catch (InterruptedException e) {
      }
    }
    int b = balance;
    String category = "";
    if (money >= 0) {
      category = "�a����";
    } else {
      category = "���o��";
    }
    System.out.println(category + "�O�̎c���F" + b);
    b = b + money;
    System.out.println(category + "��̎c���F" + b);
    balance = b;
    notify();
  }
}
