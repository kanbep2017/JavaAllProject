public class BadBank {
  private int balance;

  public BadBank() {
    this.balance = 0;
  }

  public void useATM(int money) {
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
  }
}
