package mypack;

public class Train extends Vehicle {
  // private int crewNum;

  public Train(int crewNum) {
    this.crewNum = crewNum;
  }

  public void showCrewNum() {
    System.out.println("�d�Ԃ̏�q�F" + crewNum + "��");
  }
}
