public class Taxi1 extends Car1 {
  private int price;

  public void start() {
    this.price = 420;
  }

  public void run() {
    this.price += 80;
  }

  public void display() {
    System.out.println("������" + this.price + "�~�ł�");
  }
}
